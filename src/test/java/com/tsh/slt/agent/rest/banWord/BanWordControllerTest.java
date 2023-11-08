package com.tsh.slt.agent.rest.banWord;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsh.slt.agent.domain.banWord.model.SltrLcBanWordDef;
import com.tsh.slt.agent.domain.banWord.service.SltrLcBanWordDefService;
import com.tsh.slt.agent.domain.banWord.vo.dto.SltrLcBanWordSaveRequestDto;
import com.tsh.slt.agent.domain.banWord.vo.dto.SltrLcBanWordUpdateUseYnRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

enum CODE{
    objId;
}
enum URI{
    save("/banWord/saveBanWord"),
    update("/banWord/putBanWord"),

    get("/banWord/selectBanWordByObjId"),

    updateUseYn("/banWord/updateUseYn"),

    delete("/banWord/deleteBanWordByObjId");

    String val;
    URI(String val){
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BanWordControllerTest {

    @LocalServerPort
    private Integer port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private SltrLcBanWordDefService service;
    

    private static String ip = "http://localhost:";

    static HttpHeaders httpHeaders = new HttpHeaders();

    // 기본적인 JPA 테스트

    @Before
    public void setUp(){
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
    }

    @After
    public void tearUp(){
        this.service.deleteAllEntities();
    }


    @Test
    public void serviceSaveTest() throws JSONException {


        // SAVE Request

        ResponseEntity<String> responseEntity = this.saveBanWordAndGetObjId();
        JSONObject dtoObj = new JSONObject(this.saveBanWordAndGetObjId().getBody());
        String objId = dtoObj.getString(CODE.objId.name());
        log.info(objId);


        // GET Request
        String url = ip + port + URI.get.getVal() + "?" + CODE.objId.name() + "=" + objId;

        ResponseEntity<String> responseGetEntity = testRestTemplate.getForEntity(url, String.class);
        log.info(responseGetEntity.getBody());
        String getObjId = new JSONObject(responseGetEntity.getBody()).getString(CODE.objId.name());


        // COMPARE
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseGetEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(objId).isEqualTo(getObjId);

    }

    @Test
    public void serviceUpdateUseYnTest() throws JsonProcessingException, JSONException {


        // SAVE Request
        ResponseEntity<String> responseEntity = this.saveBanWordAndGetObjId();
        JSONObject dtoObj = new JSONObject(this.saveBanWordAndGetObjId().getBody());
        String objId = dtoObj.getString(CODE.objId.name());
        log.info(objId);

        // GET
        SltrLcBanWordDef savedEntity = this.service.getBanWordByObjId(objId).get();
        log.info(savedEntity.getObjId());

        // Update 테스트

        String updateUseYn = (savedEntity.getUseYn().toString().equals("Y")) ? "N" : "Y";

        SltrLcBanWordUpdateUseYnRequestDto sltrLcBanWordUpdateRequestDto = SltrLcBanWordUpdateUseYnRequestDto.builder()
                .objId(objId)
                .useYn(updateUseYn)
                .build();

        // Convert DTO into JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String updatePayload = objectMapper.writeValueAsString(sltrLcBanWordUpdateRequestDto);
        log.info("Update request paylod: {}", updatePayload);

        String updateUrl = ip + port + URI.updateUseYn.getVal();
        HttpEntity<String> updateRequest = new HttpEntity<>(updatePayload, httpHeaders);
        ResponseEntity<String> updateResponseEntity = testRestTemplate.postForEntity(updateUrl, updateRequest, String.class);
        log.info(updateResponseEntity.getBody());

        SltrLcBanWordDef updatedEntity = this.service.getBanWordByObjId(updateResponseEntity.getBody()).get();


        assertThat(updateResponseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(updatedEntity.getUseYn().toString()).isEqualTo(updatedEntity.getUseYn().toString());

    }

    @Test
    public void serviceDeleteKeyTest() throws JSONException {
        // SAVE Request
        ResponseEntity<String> responseEntity = this.saveBanWordAndGetObjId();
        JSONObject dtoObj = new JSONObject(this.saveBanWordAndGetObjId().getBody());
        String objId = dtoObj.getString(CODE.objId.name());
        log.info(objId);

        // Delete

        String deleteUrl = ip + port + URI.delete.getVal() + "?" + CODE.objId.name() + "=" + objId;
        HttpEntity<String> request = new HttpEntity<>(httpHeaders);
        ResponseEntity<String> updateResponseEntity = testRestTemplate.exchange(
                deleteUrl, // Include the objId as a query parameter
                org.springframework.http.HttpMethod.DELETE,
                request,
                String.class
        );

        // GET
        boolean isNull = this.service.getBanWordByObjId(objId).isEmpty();


        assertThat(updateResponseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(isNull).isEqualTo(true);

    }

    private ResponseEntity<String> saveBanWordAndGetObjId() throws JSONException {
        // SAVE Request
        String url = ip + port + URI.save.getVal();

        String payload = new SltrLcBanWordSaveRequestDto().getSamplePayload();

        HttpEntity<String> request = new HttpEntity<>(payload, httpHeaders);
        ResponseEntity<String> responseEntity = testRestTemplate.postForEntity(url, request, String.class);

        return responseEntity;
    }


    
    // Mapper 테스트

}

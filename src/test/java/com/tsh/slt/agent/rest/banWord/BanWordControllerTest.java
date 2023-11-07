package com.tsh.slt.agent.rest.banWord;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsh.slt.agent.domain.banWord.model.SltrLcBanWordDef;
import com.tsh.slt.agent.domain.banWord.service.SltrLcBanWordDefService;
import com.tsh.slt.agent.domain.banWord.vo.dto.SltrLcBanWordSaveRequestDto;
import com.tsh.slt.agent.domain.banWord.vo.dto.SltrLcBanWordUpdateUseYnRequestDto;
import lombok.extern.slf4j.Slf4j;
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
enum URI{
    save("/banWord/postBanWord"),
    update("/banWord/putBanWord"),

    updateUseYn("/banWord/updateUseYn"),

    delete("/banWord/deleteBanWord");

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
    public void serviceSaveTest(){

        String url = ip + port + URI.save.getVal();

        String payload = new SltrLcBanWordSaveRequestDto().getSamplePayload();

        HttpEntity<String> request = new HttpEntity<>(payload, httpHeaders);
        ResponseEntity<String> responseEntity = testRestTemplate.postForEntity(url, request, String.class);

        String objId = responseEntity.getBody();
        log.info(objId);

        SltrLcBanWordDef savedEntity = this.service.getBanWordByObjId(objId).get();
        log.info(savedEntity.getObjId());


        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo(savedEntity.getObjId());

    }

    @Test
    public void serviceUpdateUseYnTest() throws JsonProcessingException {
        
        // 샘플  Save
        String url = ip + port + URI.save.getVal();

        String payload = new SltrLcBanWordSaveRequestDto().getSamplePayload();

        HttpEntity<String> request = new HttpEntity<>(payload, httpHeaders);
        ResponseEntity<String> responseEntity = testRestTemplate.postForEntity(url, request, String.class);

        String objId = responseEntity.getBody();
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
    public void serviceDeleteTest(){
        // 샘플  Save
        String url = ip + port + URI.save.getVal();

        String payload = new SltrLcBanWordSaveRequestDto().getSamplePayload();

        HttpEntity<String> request = new HttpEntity<>(payload, httpHeaders);
        ResponseEntity<String> responseEntity = testRestTemplate.postForEntity(url, request, String.class);

        String objId = responseEntity.getBody();
        SltrLcBanWordDef savedEntity = this.service.getBanWordByObjId(objId).get();
        log.info(savedEntity.getObjId());
    }


    
    // Mapper 테스트

}

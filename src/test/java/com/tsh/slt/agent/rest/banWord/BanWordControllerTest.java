package com.tsh.slt.agent.rest.banWord;

import com.tsh.slt.agent.domain.banWord.model.SltrLcBanWordDef;
import com.tsh.slt.agent.domain.banWord.service.SltrLcBanWordDefService;
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


        String payload = "{\n" +
                        "  \"userObjId\": \"DavidKim\",\n" +
                        "  \"bandWord\": \"Ban-Word\",\n" +
                        "  \"langCode\": \"KR\",\n" +
                        "  \"wordCateCode\": \"BAN\",\n" +
                        "  \"alterWord\": \"\",\n" +
                        "  \"useYn\": \"Y\",\n" +
                        "  \"createDate\": \"2023-11-02\",\n" +
                        "  \"createUserId\": \"DavidKim\",\n" +
                        "  \"updateDate\": \"2023-11-02\",\n" +
                        "  \"updateUserId\": \"DavidKim\"\n" +
                        "}";

        HttpEntity<String> request = new HttpEntity<>(payload, httpHeaders);
        ResponseEntity<String> responseEntity = testRestTemplate.postForEntity(url, request, String.class);

        String objId = responseEntity.getBody();
        log.info(objId);

        SltrLcBanWordDef savedEntity = this.service.getBanWordByObjId(objId);
        log.info(savedEntity.getObjId());


        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo(savedEntity.getObjId());

    }
    
    @Test
    public void serviceUpdateTest(){}
    
    @Test
    public void serviceDeleteTest(){}


    
    // Mapper 테스트

}

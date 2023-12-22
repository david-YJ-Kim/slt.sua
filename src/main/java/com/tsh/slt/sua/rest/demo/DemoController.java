package com.tsh.slt.sua.rest.demo;

import com.tsh.slt.sua.domain.demo.service.SltrLcDemoService;
import com.tsh.slt.sua.domain.demo.vo.MyAllApiListVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Sellter Agent - Demo API Controller")
@RestController
//@RequestMapping(value = "/demo", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping(value = "/demo")
// Extended Abstract Controller, delved by hynix.
public class DemoController {

    @Autowired
    SltrLcDemoService demoService;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/getMyAllApiList", method = RequestMethod.GET)
    @Operation(description = "View My All API", summary = "Summary : View My All API")
//    public List<MyAllApiListVo> getMyAllApiList(UserInfoVo paramVo) throws Exception {
    public List<MyAllApiListVo> getMyAllApiList() throws Exception {
        System.out.println("Demo API has been called");
        try{
//            return demoService.getMyAllApiList(paramVo);
            return demoService.getMyAllApiList(null);
        } catch (Exception ex){
//            throw new Exception(HttpStatus.BAD_REQUEST, ex.getMessage(), ex.getCause());
            System.err.println(ex.getMessage());
            ex.printStackTrace();
            throw new Exception();
        }
    }


}

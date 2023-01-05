package com.plexter.sellter.agent.demo.controller;

import com.plexter.sellter.agent.demo.service.DemoService;
import com.plexter.sellter.agent.demo.vo.MyAllApiListVo;
import com.plexter.sellter.agent.module.vo.UserInfoVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.AbstractController;

import java.util.List;

@Tag(name = "Sellter Agent - Demo API Controller")
@RestController
//@RequestMapping(value = "/demo", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping(value = "/demo")
// Extended Abstract Controller, delved by hynix.
public class DemoController {

    @Autowired
    DemoService demoService;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/getMyAllApiList", method = RequestMethod.GET)
    @Operation(description = "View My All API", summary = "Summary : View My All API")
//    public List<MyAllApiListVo> getMyAllApiList(UserInfoVo paramVo) throws Exception {
    public List<MyAllApiListVo> getMyAllApiList() throws Exception {
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

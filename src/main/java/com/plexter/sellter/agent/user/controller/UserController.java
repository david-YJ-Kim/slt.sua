package com.plexter.sellter.agent.user.controller;

import com.plexter.sellter.agent.user.service.UserService;
import com.plexter.sellter.agent.user.vo.SltrLcImgDtlVO;
import com.plexter.sellter.agent.user.vo.SltrLcUserVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Sellter Agent User Controller.")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService service;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcImgDtl", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcImgDtl(SltrLcImgDtlVO vo){
        return service.saveSltrLcImgDtl(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcUser", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcUser(SltrLcUserVO vo){
        return service.saveSltrLcUser(vo);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcImgDtl", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcImgDtlVO putSltrLcImgDtl(SltrLcImgDtlVO vo){
        return service.updateSltrLcImgDtl(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcUser", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcUserVO putSltrLcUser(SltrLcUserVO vo){
        return service.updateSltrLcUser(vo);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteSltrLcImgDtl", method = RequestMethod.DELETE)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcImgDtlVO deleteSltrLcImgDtl(@RequestParam("id") String id){
        if(id.isEmpty()) {
            throw new NullPointerException("Object id is empty");
        }
        return service.deleteSltrLcImgDtlById(id);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteSltrLcUser", method = RequestMethod.DELETE)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcUserVO deleteSltrLcUser(@RequestParam("Id") String id){
        if(id.isEmpty()) {
            throw new NullPointerException("Object id is empty");
        }
        return service.deleteSltrLcUserById(id);
    }

}

package com.plexter.sellter.agent.code.controller;

import com.plexter.sellter.agent.code.service.CodeService;
import com.plexter.sellter.agent.code.vo.SltrLcCodeDefVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Sellter Agent Code Controller.")
@RestController
@RequestMapping(value = "/code")
public class CodeController {

    @Autowired
    CodeService service;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcCodeDef", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcCodeDef(SltrLcCodeDefVO vo){
        return service.saveSltrLcCodeDef(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcCodeDef", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcCodeDefVO putSltrLcCodeDef(SltrLcCodeDefVO vo){
        return service.updateSltrLcCodeDef(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteSltrLcCodeDef", method = RequestMethod.DELETE)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcCodeDefVO deleteSltrLcCodeDef(@RequestParam("id") String id){
        if(id.isEmpty()) {
            throw new NullPointerException("Object id is empty");
        }
        return service.deleteSltrLcCodeDefById(id);
    }

}

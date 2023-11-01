package com.tsh.slt.agent.rest.code;

import com.tsh.slt.agent.domain.code.service.CodeService;
import com.tsh.slt.agent.domain.code.vo.SltrLcCodeDefVO;
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
    public String postSltrLcCodeDef(@RequestBody SltrLcCodeDefVO vo){

        System.out.println(vo.toString());
        return service.saveSltrLcCodeDef(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcCodeDef", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcCodeDefVO putSltrLcCodeDef(@RequestBody SltrLcCodeDefVO vo){
        System.out.println(vo.toString());
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

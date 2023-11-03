package com.tsh.slt.agent.rest.bizAccount;

import com.tsh.slt.agent.domain.bizAccount.service.SltrLcBizDefService;
import com.tsh.slt.agent.domain.bizAccount.vo.SltrLcBizDefVO;
import com.tsh.slt.agent.domain.bizAccount.vo.SltrLcBizMktRelVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Sellter Agent BizACoount Controller.")
@RestController
@RequestMapping(value = "/bizAccount")
public class BizAccountController {

    @Autowired
    SltrLcBizDefService service;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcBizDef", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcBizDef(@RequestBody SltrLcBizDefVO vo){
        System.out.println(vo.toString());
        return service.saveSltrLcBizDef(vo);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcBizMktRel", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcBizMktRel(@RequestBody SltrLcBizMktRelVO vo){
        System.out.println(vo.toString());
        return service.saveSltrBizMktRel(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/updateSltrLcBizDef", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcBizDefVO updateSltrLcBizDef(@RequestBody SltrLcBizDefVO vo){
        System.out.println(vo.toString());
        return service.updateSltrLcBizDef(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/updateSltrLcBizMktRel", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcBizMktRelVO updateSltrLcBizMktRel (@RequestBody SltrLcBizMktRelVO vo){
        System.out.println(vo.toString());
        return service.updateSltrBizMktRel(vo);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteSltrLcBizDef", method = RequestMethod.DELETE)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcBizDefVO deleteSltrLcBizDef(@RequestParam("id") String id){
        if(id.isEmpty()) {
            throw new NullPointerException("Object id is empty");
        }
        return service.deleteSltrLcBizDefById(id);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteSltrLcBizMktRel", method = RequestMethod.DELETE)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcBizMktRelVO deleteSltrLcBizMktRel(@RequestParam("id") String id){
        if(id.isEmpty()) {
            throw new NullPointerException("Object id is empty");
        }
        return service.deleteSltrBizMktRelById(id);
    }

}

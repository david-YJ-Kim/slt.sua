package com.plexter.sellter.agent.market.controller;

import com.plexter.sellter.agent.market.service.MarketService;
import com.plexter.sellter.agent.market.vo.SltrLcMktDefVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Sellter Agent Keywprd Controller.")
@RestController
@RequestMapping(value = "/keyword")
public class MarketController {

    @Autowired
    MarketService service;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcMktDef", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcMktDef (SltrLcMktDefVO vo){
        return service.saveSltrLcMktDef(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcMktDef", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcMktDefVO putSltrLcMktDef(SltrLcMktDefVO vo){
        return service.updateSltrLcMktDef(vo);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteSltrLcMktDef", method = RequestMethod.DELETE)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcMktDefVO deleteSltrLcMktDef(@RequestParam("id") String id){
        if(id.isEmpty()) {
            throw new NullPointerException("Object id is empty");
        }
        return service.deleteSltrLcMktDefById(id);
    }


}

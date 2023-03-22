package com.plexter.sellter.agent.keyword.controller;

import com.plexter.sellter.agent.keyword.service.KeywordService;
import com.plexter.sellter.agent.keyword.vo.SltrLcKeywordVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Sellter Agent Keyword Controller.")
@RestController
@RequestMapping(value = "/keyword")
public class KeywordController {

    @Autowired
    KeywordService service;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcKeyword", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcKeyword(SltrLcKeywordVO vo){
        return service.saveSltrLcKeyword(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcKeyword", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcKeywordVO putSltrLcKeyword(SltrLcKeywordVO vo){
        return service.updateSltrLcKeyword(vo);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteSltrLcKeyword", method = RequestMethod.DELETE)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcKeywordVO deleteSltrLcKeyword(@RequestParam("id") String id){
        if(id.isEmpty()) {
            throw new NullPointerException("Object id is empty");
        }
        return service.deleteSltrLcKeywordById(id);
    }

}
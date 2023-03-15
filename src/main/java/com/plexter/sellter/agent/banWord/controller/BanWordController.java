package com.plexter.sellter.agent.banWord.controller;

import com.plexter.sellter.agent.banWord.service.BanWordService;
import com.plexter.sellter.agent.banWord.vo.BanWordVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Sellter Agent Banword Controller. TBL : SLTR_LC_BAN_WORD_DEF")
@RestController
@RequestMapping(value = "/banWord")
public class BanWordController {

    @Autowired
    BanWordService banWordService;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postBanWord", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public void postBanWord(@RequestBody BanWordVO vo){
        System.out.println("Hello");
        System.out.println(vo.toString());
        banWordService.addBanWord(vo);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/getBanWord", method = RequestMethod.GET)
    @Operation(description = "TBD", summary = "TBD")
    public BanWordVO selectBanWord(@RequestParam("id") String objectId){
        System.out.println(objectId);
        return banWordService.getBanWordById(objectId);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/getAllBanWord", method = RequestMethod.GET)
    @Operation(description = "TBD", summary = "TBD")
    public List<BanWordVO> selectAllBanWord(){
        return banWordService.getAllBanWord();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteBanWord", method = RequestMethod.DELETE)
    @Operation(description = "TBD", summary = "TBD")
    public void deleteBanWordById(@RequestParam("id") String objectId){
        System.out.println(objectId);
        banWordService.deleteBanWordById(objectId);
    }


}

package com.tsh.slt.agent.rest.banWord;

import com.tsh.slt.agent.domain.banWord.service.BanWordService;
import com.tsh.slt.agent.domain.banWord.vo.SltrLcBanWordDefVO;
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
    public void postBanWord(@RequestBody SltrLcBanWordDefVO vo){
        System.out.println(vo.toString());
        banWordService.addBanWord(vo);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putBanWord", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public void updateBanWord(@RequestBody SltrLcBanWordDefVO vo){
        System.out.println(vo.toString());
        banWordService.updateBanWord(vo);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/getBanWord", method = RequestMethod.GET)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcBanWordDefVO selectBanWordById(@RequestParam("id") String objectId){
        System.out.println(objectId);
        return banWordService.getBanWordById(objectId);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/getAllBanWord", method = RequestMethod.GET)
    @Operation(description = "TBD", summary = "TBD")
    public List<SltrLcBanWordDefVO> selectAllBanWord(){
        return banWordService.getAllBanWord();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/getBanWordByWord", method = RequestMethod.GET)
    @Operation(description = "TBD", summary = "TBD")
    public List<SltrLcBanWordDefVO> selectBanWordByWord(@RequestParam("word") String word){
        System.out.println(word);
        return banWordService.getBanWordByWord(word);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteBanWord", method = RequestMethod.DELETE)
    @Operation(description = "TBD", summary = "TBD")
    public void deleteBanWordById(@RequestParam("id") String objectId){
        System.out.println(objectId);
        banWordService.deleteBanWordById(objectId);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteBanWordByWord", method = RequestMethod.DELETE)
    @Operation(description = "TBD", summary = "TBD")
    public void deleteBanWordByWord(@RequestParam("word") String word){
        System.out.println(word);
        banWordService.deleteBanWordByWord(word);
    }


}

package com.tsh.slt.sua.rest.banWord;

import com.tsh.slt.sua.domain.banWord.model.SltrLcBanWordDef;
import com.tsh.slt.sua.domain.banWord.service.SltrLcBanWordDefService;
import com.tsh.slt.sua.domain.banWord.vo.dto.SltrLcBanWordResponseDto;
import com.tsh.slt.sua.domain.banWord.vo.dto.SltrLcBanWordSaveRequestDto;
import com.tsh.slt.sua.domain.banWord.vo.dto.SltrLcBanWordUpdateUseYnRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Slf4j
@Tag(name = "Sellter Agent Banword Controller. TBL : SLTR_LC_BAN_WORD_DEF")
@RestController
@RequestMapping(value = "/banWord")
public class BanWordController {

    @Autowired
    SltrLcBanWordDefService banWordService;

    public static String a = "A";

    /**
     * ########################################################################
     * SAVE
     * ########################################################################
     */
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/saveBanWord", method = RequestMethod.POST)
    public ResponseEntity<SltrLcBanWordResponseDto> saveEntity(@RequestBody SltrLcBanWordSaveRequestDto saveRequestDto) {
        log.info(saveRequestDto.toString());

        SltrLcBanWordResponseDto responseDto = new SltrLcBanWordResponseDto(this.banWordService.saveEntity(saveRequestDto));
        log.info(responseDto.toString());
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }


    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postBanWord", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postBanWord(@RequestBody SltrLcBanWordSaveRequestDto requestDto){
        log.info(requestDto.toString());
        return banWordService.saveEntity(requestDto).getObjId();
    }



    /**
     * ########################################################################
     * GET
     * ########################################################################
     */

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/selectBanWordByObjId", method = RequestMethod.GET)
    public ResponseEntity<SltrLcBanWordResponseDto> selectEntityByObjId(@RequestParam("objId") String objId) {

        log.info(objId);
        Optional<SltrLcBanWordDef> entity = this.banWordService.getBanWordByObjId(objId);
        if(!entity.isEmpty()){
            return new ResponseEntity<>(new SltrLcBanWordResponseDto(entity.get()), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.OK);
        }
    }

    /**
     * ########################################################################
     * UPDATE
     * ########################################################################
     */
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/updateUseYn", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String updateUseYnByObjId(@RequestBody SltrLcBanWordUpdateUseYnRequestDto vo){
        log.info(vo.toString());
        return this.banWordService.updateUseYnByObjId(vo);
    }



    /**
     * ########################################################################
     * DELETE
     * ########################################################################
     */

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteBanWordByObjId", method = RequestMethod.DELETE)
    public ResponseEntity deleteEntityByObjId(@RequestParam("objId") String objId) {
        this.banWordService.deleteEntitiesByObjId(objId);
        return new ResponseEntity(HttpStatus.OK);
    }



//    @ResponseStatus(value = HttpStatus.OK)
//    @RequestMapping(value = "/putBanWord", method = RequestMethod.PUT)
//    @Operation(description = "TBD", summary = "TBD")
//    public void updateBanWord(@RequestBody BanWordDefVO vo){
//        System.out.println(vo.toString());
//        banWordService.updateBanWord(vo);
//    }
//
//    @ResponseStatus(value = HttpStatus.OK)
//    @RequestMapping(value = "/getBanWord", method = RequestMethod.GET)
//    @Operation(description = "TBD", summary = "TBD")
//    public BanWordDefVO selectBanWordById(@RequestParam("id") String objectId){
//        System.out.println(objectId);
//        return banWordService.getBanWordById(objectId);
//    }
//
//    @ResponseStatus(value = HttpStatus.OK)
//    @RequestMapping(value = "/getAllBanWord", method = RequestMethod.GET)
//    @Operation(description = "TBD", summary = "TBD")
//    public List<BanWordDefVO> selectAllBanWord(){
//        return banWordService.getAllBanWord();
//    }
//
//    @ResponseStatus(value = HttpStatus.OK)
//    @RequestMapping(value = "/getBanWordByWord", method = RequestMethod.GET)
//    @Operation(description = "TBD", summary = "TBD")
//    public List<BanWordDefVO> selectBanWordByWord(@RequestParam("word") String word){
//        System.out.println(word);
//        return banWordService.getBanWordByWord(word);
//    }
//
//    @ResponseStatus(value = HttpStatus.OK)
//    @RequestMapping(value = "/deleteBanWord", method = RequestMethod.DELETE)
//    @Operation(description = "TBD", summary = "TBD")
//    public void deleteBanWordById(@RequestParam("id") String objectId){
//        System.out.println(objectId);
//        banWordService.deleteBanWordById(objectId);
//    }
//
//    @ResponseStatus(value = HttpStatus.OK)
//    @RequestMapping(value = "/deleteBanWordByWord", method = RequestMethod.DELETE)
//    @Operation(description = "TBD", summary = "TBD")
//    public void deleteBanWordByWord(@RequestParam("word") String word){
//        System.out.println(word);
//        banWordService.deleteBanWordByWord(word);
//    }


}

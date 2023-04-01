package com.plexter.sellter.agent.user.controller;

import com.plexter.sellter.agent.user.dto.UserMasterDataDTO;
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


    @GetMapping("/{userId}")
    public SltrLcUserVO getSltrLcUser(@PathVariable String userId) {
        return service.selectSltrLcUser(userId);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/setUserMasterData", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public void postUserMasterData(@RequestBody  UserMasterDataDTO dto){

        SltrLcUserVO vo = new SltrLcUserVO();
        vo.setUSER_ID(dto.getUserId());
        vo.setUSER_NAME(dto.getUserName());
        vo.setUSD_EXCH_RATE(dto.getUsdExchRate());
        vo.setCNY_EXCH_RATE(dto.getCnyExchRate());
        vo.setBASE_MGN_RATE(dto.getBaseMgnRate());
        vo.setBASE_MGN_VALUE(dto.getBaseMgnValue());
        vo.setCUSTM_EXCD_MGN_RATE(dto.getCustmExcdMgnRate());
        vo.setCUSTM_EXCD_MGN_VALUE(dto.getCustmExcdMgnValue());
        vo.setSHIP_FEE_TYPE(dto.getShipFeeType());
        vo.setBASE_SHIP_FEE(dto.getBaseShipFee());
        vo.setRTRN_SHIP_FEE(dto.getRtrnShipFee());
        vo.setEXCD_SHIP_FEE(dto.getExcdShipFee());
        // JEJU_SHIP_FEE
        // REMOTE_AREA_SHIP_FEE
        vo.setMFR_NAME(dto.getMfrName());
        vo.setBRAND_NAME(dto.getBrandName());
        vo.setUNDR_PUR_AVAIL_FLAG(dto.getUndrPurAvailFlag());
        vo.setTHUMB_OPTION_YNl(dto.getThumbOptionYn());
        vo.setTOP_IMG_USE_FLAG(dto.getTopImgUseFlag());
        vo.setBASE_TOP_IMG_USE_FLAG(dto.getBaseTopImgUseFlag());
        // TOP_IMG_FILE_PATH
        vo.setBOT_IMG_USE_FLAG(dto.getBotImgUseFlag());
        vo.setBASE_BOT_IMG_USE_FLAG(dto.getBaseBotImgUseFlag());
        // BOT_IMG_FILE_PATH
        vo.setHASH_TAG_AUTO_YN(dto.getHashTagAutoYn());


        service.saveSltrLcUser(vo);
        System.out.println(dto.toString());
    }

}

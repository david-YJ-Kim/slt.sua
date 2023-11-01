package com.tsh.slt.agent.rest.user;

import com.tsh.slt.agent.domain.user.dto.UserMasterDataDTO;
import com.tsh.slt.agent.domain.user.service.UserService;
import com.tsh.slt.agent.domain.user.vo.SltrLcImgDtlVO;
import com.tsh.slt.agent.domain.user.vo.SltrLcUserVO;
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
    public String postSltrLcImgDtl(@RequestBody SltrLcImgDtlVO vo){
        return service.saveSltrLcImgDtl(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcUser", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcUser(@RequestBody SltrLcUserVO vo){

        System.out.println(vo.toString());
        return service.saveSltrLcUser(vo);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcImgDtl", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcImgDtlVO putSltrLcImgDtl(@RequestBody SltrLcImgDtlVO vo){

        System.out.println(vo.toString());
        return service.updateSltrLcImgDtl(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcUser", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcUserVO putSltrLcUser(@RequestBody SltrLcUserVO vo){

        System.out.println(vo.toString());
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
        System.out.println("====================print dto");
        System.out.println(dto.toString());

        SltrLcUserVO vo = new SltrLcUserVO();
        vo.setUSER_ID(dto.getUSER_ID());
        vo.setUSER_NAME(dto.getUSER_NAME());
        vo.setUSD_EXCH_RATE(dto.getUSD_EXCH_RATE());
        vo.setCNY_EXCH_RATE(dto.getCNY_EXCH_RATE());
        vo.setBASE_MGN_RATE(dto.getBASE_MGN_RATE());
        vo.setBASE_MGN_VALUE(dto.getBASE_MGN_VALUE());
        vo.setCUSTM_EXCD_MGN_RATE(dto.getCUSTM_EXCD_MGN_RATE());
        vo.setCUSTM_EXCD_MGN_VALUE(dto.getCUSTM_EXCD_MGN_VALUE());
        vo.setSHIP_FEE_TYPE(dto.getSHIP_FEE_TYPE());
        vo.setBASE_SHIP_FEE(dto.getBASE_SHIP_FEE());
        vo.setRTRN_SHIP_FEE(dto.getRTRN_SHIP_FEE());
        vo.setEXCD_SHIP_FEE(dto.getEXCD_SHIP_FEE());
        // JEJU_SHIP_FEE
        // REMOTE_AREA_SHIP_FEE
        vo.setMFR_NAME(dto.getMFR_NAME());
        vo.setBRAND_NAME(dto.getBRAND_NAME());
        vo.setUNDR_PUR_AVAIL_FLAG(dto.getUNDR_PUR_AVAIL_FLAG());
        vo.setTHUMB_OPTION_YNl(dto.getTHUMB_OPTION_YN());
        vo.setTOP_IMG_USE_FLAG(dto.getTOP_IMG_USE_FLAG());
        vo.setBASE_TOP_IMG_USE_FLAG(dto.getBASE_TOP_IMG_USE_FLAG());
        // TOP_IMG_FILE_PATH
        vo.setBOT_IMG_USE_FLAG(dto.getBOT_IMG_USE_FLAG());
        vo.setBASE_BOT_IMG_USE_FLAG(dto.getBASE_BOT_IMG_USE_FLAG());
        // BOT_IMG_FILE_PATH
        vo.setHASH_TAG_AUTO_YN(dto.getHASH_TAG_AUTO_YN());

        System.out.println(vo.toString());

        service.saveSltrLcUser(vo);
        System.out.println(dto.toString());
    }

}

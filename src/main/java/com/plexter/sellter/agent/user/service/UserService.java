package com.plexter.sellter.agent.user.service;

import com.plexter.sellter.agent.user.mapper.UserMapper;
import com.plexter.sellter.agent.user.vo.SltrLcImgDtlVO;
import com.plexter.sellter.agent.user.vo.SltrLcUserVO;
import com.plexter.sellter.agent.util.ParsingCommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper mapper;

    public SltrLcUserVO selectSltrLcUser(String userId) {
        return mapper.selectSltrLcUser(userId);
    }

    // Create
    public String saveSltrLcImgDtl(SltrLcImgDtlVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCIMGDTL"));
        mapper.saveSltrLcImgDtl(vo);
        return vo.getOBJ_ID();
    }
    public String saveSltrLcUser(SltrLcUserVO vo){

        System.out.println("====================");
        System.out.println(vo.toString());
        System.out.println(mapper.selectSltrLcUser(vo.getUSER_ID()).getOBJ_ID());

        if(mapper.selectSltrLcUser(vo.getUSER_ID()).getOBJ_ID().isEmpty()){
            vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCUSR"));
            System.out.println(vo.toString());

            mapper.saveSltrLcUser(vo);
        }else{
            this.updateSltrLcUser(vo);
        }


        return vo.getOBJ_ID();
    }

    // Update
    public SltrLcImgDtlVO updateSltrLcImgDtl(SltrLcImgDtlVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        return mapper.updateSltrLcImgDtl(vo);
    }
    public SltrLcUserVO updateSltrLcUser(SltrLcUserVO vo){
        System.out.println(vo.toString());
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        mapper.updateSltrLcUser(vo);
        return vo;
    }

    // Delete By Id
    public SltrLcImgDtlVO deleteSltrLcImgDtlById(String id){
        return mapper.deleteSltrLcImgDtlById(id);
    }
    public SltrLcUserVO deleteSltrLcUserById(String id){
        return mapper.deleteSltrLcUserById(id);
    }

}

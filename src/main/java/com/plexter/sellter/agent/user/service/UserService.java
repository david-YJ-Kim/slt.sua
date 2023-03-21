package com.plexter.sellter.agent.user.service;

import com.plexter.sellter.agent.user.mapper.UserMapper;
import com.plexter.sellter.agent.user.vo.SltrLcImgDtlVO;
import com.plexter.sellter.agent.user.vo.SltrLcUserVO;
import com.plexter.sellter.agent.util.ParsingCommonUtil;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Mapper
    UserMapper mapper;

    // Create
    public String saveSltrLcImgDtl(SltrLcImgDtlVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCIMGDTL"));
        return mapper.saveSltrLcImgDtl(vo);
    }
    public String saveSltrLcUser(SltrLcUserVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCUSR"));
        return mapper.saveSltrLcUser(vo);
    }

    // Update
    public SltrLcImgDtlVO updateSltrLcImgDtl(SltrLcImgDtlVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        return mapper.updateSltrLcImgDtl(vo);
    }
    public SltrLcUserVO updateSltrLcUser(SltrLcUserVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        return mapper.updateSltrLcUser(vo);
    }

    // Delete By Id
    public SltrLcImgDtlVO deleteSltrLcImgDtlById(String id){
        return mapper.deleteSltrLcImgDtlById(id);
    }
    public SltrLcUserVO deleteSltrLcUserById(String id){
        return mapper.deleteSltrLcUserById(id);
    }

}

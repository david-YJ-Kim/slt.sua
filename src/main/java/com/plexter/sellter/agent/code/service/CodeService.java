package com.plexter.sellter.agent.code.service;

import com.plexter.sellter.agent.code.mapper.CodeMapper;
import com.plexter.sellter.agent.code.vo.SltrLcCodeDefVO;
import com.plexter.sellter.agent.util.ParsingCommonUtil;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
public class CodeService {

    @Mapper
    CodeMapper codeMapper;

    public String saveSltrLcCodeDef(SltrLcCodeDefVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCCR"));
        return codeMapper.saveSltrLcCodeDef(vo);
    }

    public SltrLcCodeDefVO updateSltrLcCodeDef(SltrLcCodeDefVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        return codeMapper.updateSltrLcCodeDef(vo);
    }

    public SltrLcCodeDefVO deleteSltrLcCodeDefById(String id){
        return  codeMapper.deleteSltrLcCodeDefById(id);
    }

}


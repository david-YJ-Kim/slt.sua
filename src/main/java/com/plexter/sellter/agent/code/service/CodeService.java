package com.plexter.sellter.agent.code.service;

import com.plexter.sellter.agent.code.mapper.CodeMapper;
import com.plexter.sellter.agent.code.vo.SltrLcCodeDefVO;
import com.plexter.sellter.agent.util.ParsingCommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeService {

    @Autowired
    CodeMapper codeMapper;

    public String saveSltrLcCodeDef(SltrLcCodeDefVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCCR"));

        System.out.println(vo.toString());
        codeMapper.saveSltrLcCodeDef(vo);
        return vo.getOBJ_ID();
    }

    public SltrLcCodeDefVO updateSltrLcCodeDef(SltrLcCodeDefVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        codeMapper.updateSltrLcCodeDef(vo);
        System.out.println(codeMapper.getSltrLcCodeDefById(vo.getOBJ_ID()));
        return codeMapper.getSltrLcCodeDefById(vo.getOBJ_ID());
    }

    public SltrLcCodeDefVO deleteSltrLcCodeDefById(String id){
        SltrLcCodeDefVO vo = this.getltrLcCodeDefById(id);
        if(vo == null){
            throw new NullPointerException("Id is not defined. " + id);
        }
        codeMapper.deleteSltrLcCodeDefById(id);
        return  vo;
    }

    public SltrLcCodeDefVO getltrLcCodeDefById(String id){
        return codeMapper.getSltrLcCodeDefById(id);
    }

}


package com.plexter.sellter.agent.keyword.service;

import com.plexter.sellter.agent.keyword.mapper.KeywordMapper;
import com.plexter.sellter.agent.keyword.vo.SltrLcKeywordVO;
import com.plexter.sellter.agent.util.ParsingCommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeywordService {

    @Autowired
    KeywordMapper keywordMapper;

    public String saveSltrLcKeyword(SltrLcKeywordVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCKWO"));
        keywordMapper.saveSltrLcKeyword(vo);
        return vo.getOBJ_ID();
    }

    public SltrLcKeywordVO updateSltrLcKeyword(SltrLcKeywordVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        keywordMapper.updateSltrLcKeyword(vo);
        return keywordMapper.getSltrLcKeywordById(vo.getOBJ_ID());
    }

    public SltrLcKeywordVO deleteSltrLcKeywordById(String id){
        SltrLcKeywordVO vo = this.getSltrLcKeywordById(id);
        if(vo == null){
            throw new NullPointerException("Id is not defined. " + id);
        }
        keywordMapper.deleteSltrLcKeywordById(id);
        return keywordMapper.getSltrLcKeywordById(vo.getOBJ_ID());
    }

    public SltrLcKeywordVO getSltrLcKeywordById(String id){
        System.out.println(id);
        return keywordMapper.getSltrLcKeywordById(id);
    }
}

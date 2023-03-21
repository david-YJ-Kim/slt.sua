package com.plexter.sellter.agent.keyword.service;

import com.plexter.sellter.agent.keyword.mapper.KeywordMapper;
import com.plexter.sellter.agent.keyword.vo.SltrLcKeywordVO;
import com.plexter.sellter.agent.util.ParsingCommonUtil;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
public class KeywordService {

    @Mapper
    KeywordMapper keywordMapper;

    public String saveSltrLcKeyword(SltrLcKeywordVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCKWO"));
        return keywordMapper.saveSltrLcKeyword(vo);
    }

    public SltrLcKeywordVO updateSltrLcKeyword(SltrLcKeywordVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        return keywordMapper.updateSltrLcKeyword(vo);
    }

    public SltrLcKeywordVO deleteSltrLcKeywordById(String id){
        return keywordMapper.deleteSltrLcKeywordById(id);
    }
}

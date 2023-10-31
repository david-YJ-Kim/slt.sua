package com.tsh.slt.agent.domain.keyword.service;

import com.tsh.slt.agent.util.ParsingCommonUtil;
import com.tsh.slt.agent.domain.keyword.mapper.KeywordMapper;
import com.tsh.slt.agent.domain.keyword.vo.SltrLcKeywordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeywordService {

//    ScrapServiceManager scrapServiceManager = ScrapServiceManager.getInstance();

    @Autowired
    KeywordMapper keywordMapper;

    public String saveSltrLcKeyword(SltrLcKeywordVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCKWO"));
        keywordMapper.saveSltrLcKeyword(vo);
//        scrapServiceManager.receiveOrderSheet(vo);

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

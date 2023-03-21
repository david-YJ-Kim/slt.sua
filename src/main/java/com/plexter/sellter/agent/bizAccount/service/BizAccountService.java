package com.plexter.sellter.agent.bizAccount.service;

import com.plexter.sellter.agent.bizAccount.mapper.BizAccountMapper;
import com.plexter.sellter.agent.bizAccount.vo.SltrLcBizDefVO;
import com.plexter.sellter.agent.bizAccount.vo.SltrLcBizMktRelVO;
import com.plexter.sellter.agent.util.ParsingCommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BizAccountService {
    @Autowired
    BizAccountMapper bizAccountMapper;

    public String insertSltrLcBizDef(SltrLcBizDefVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCBIDEF"));
        return bizAccountMapper.saveSltrLcBizDef(vo);
    }

    public String saveSltrBizMktRel(SltrLcBizMktRelVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCDIMKREL"));
        return bizAccountMapper.saveSltrBizMktRel(vo);
    }

    public SltrLcBizDefVO updateSltrLcBizDef(SltrLcBizDefVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        return bizAccountMapper.updateSltrLcBizDef(vo);
    }

    public SltrLcBizMktRelVO updateSltrBizMktRel(SltrLcBizMktRelVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        return bizAccountMapper.updateSltrBizMktRel(vo);
    }

    public SltrLcBizDefVO deleteSltrLcBizDefById(String id){
        return bizAccountMapper.deleteSltrLcBizDefById(id);
    }

    public SltrLcBizMktRelVO deleteSltrBizMktRelById(String id){
        return bizAccountMapper.deleteSltrBizMktRelById(id);
    }
}

package com.plexter.sellter.agent.bizAccount.service;

import com.plexter.sellter.agent.bizAccount.mapper.BizAccountMapper;
import com.plexter.sellter.agent.bizAccount.vo.SltrLcBizDefVO;
import com.plexter.sellter.agent.bizAccount.vo.SltrLcBizMktRelVO;
import com.plexter.sellter.agent.util.ParsingCommonUtil;
import com.plexter.sellter.agent.util.code.TableKeyCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BizAccountService {
    @Autowired
    BizAccountMapper bizAccountMapper;

    // insert
    public String saveSltrLcBizDef(SltrLcBizDefVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId(TableKeyCode.SLTR_TBL_011.name()));
        bizAccountMapper.saveSltrLcBizDef(vo);
        return vo.getOBJ_ID();
    }

    public String saveSltrBizMktRel(SltrLcBizMktRelVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId(TableKeyCode.SLTR_TBL_012.name()));
        return bizAccountMapper.saveSltrBizMktRel(vo);
    }

    // update
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

    // delete

    public SltrLcBizDefVO deleteSltrLcBizDefById(String id){
        return bizAccountMapper.deleteSltrLcBizDefById(id);
    }

    public SltrLcBizMktRelVO deleteSltrBizMktRelById(String id){
        return bizAccountMapper.deleteSltrBizMktRelById(id);
    }
}

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
        System.out.println(vo.toString());

        bizAccountMapper.saveSltrLcBizDef(vo);
        return vo.getOBJ_ID();
    }

    public String saveSltrBizMktRel(SltrLcBizMktRelVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId(TableKeyCode.SLTR_TBL_012.name()));
        bizAccountMapper.saveSltrBizMktRel(vo);
        return vo.getOBJ_ID();
    }

    // update
    public SltrLcBizDefVO updateSltrLcBizDef(SltrLcBizDefVO vo){
        System.out.println(" Update Service : " + vo.toString());
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        bizAccountMapper.updateSltrLcBizDef(vo);
        return bizAccountMapper.getSltrLcBizDefById(vo.getOBJ_ID());
    }

    public SltrLcBizMktRelVO updateSltrBizMktRel(SltrLcBizMktRelVO vo){
        System.out.println(" Update Service : " + vo.toString());
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        bizAccountMapper.updateSltrBizMktRel(vo);

        return bizAccountMapper.getSltrBizMktRelById(vo.getOBJ_ID());
    }

    // delete

    public SltrLcBizDefVO deleteSltrLcBizDefById(String id){
        SltrLcBizDefVO vo = this.getSltrLcBizDefById(id);
        if(vo == null){
            throw new NullPointerException("Id is not defined" + id);
        }
        bizAccountMapper.deleteSltrLcBizDefById(id);
        System.out.println(vo.toString());
        return vo;
    }

    public SltrLcBizMktRelVO deleteSltrBizMktRelById(String id){
        SltrLcBizMktRelVO vo = this.getSltrBizMktRelById(id);
        if(vo == null){
            throw new NullPointerException("Id is not defined" + id);
        }
        bizAccountMapper.deleteSltrBizMktRelById(id);
        return vo;
    }

    // get
    public SltrLcBizDefVO getSltrLcBizDefById(String id){
        return bizAccountMapper.getSltrLcBizDefById(id);
    }

    public SltrLcBizMktRelVO getSltrBizMktRelById(String id){
        return bizAccountMapper.getSltrBizMktRelById(id);
    }
}

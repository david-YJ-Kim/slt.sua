package com.plexter.sellter.agent.market.service;

import com.plexter.sellter.agent.market.mapper.MarketMapper;
import com.plexter.sellter.agent.market.vo.SltrLcMktDefVO;
import com.plexter.sellter.agent.util.ParsingCommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarketService {

    @Autowired
    MarketMapper mapper;


    // Create
    public String saveSltrLcMktDef(SltrLcMktDefVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCMKDEF"));
        mapper.saveSltrLcMktDef(vo);
        return vo.getOBJ_ID();
    }

    // Update
    public SltrLcMktDefVO updateSltrLcMktDef(SltrLcMktDefVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        mapper.updateSltrLcMktDef(vo);
        return this.getSltrLcMktDefById(vo.getOBJ_ID());
    }


    // Delete
    public SltrLcMktDefVO deleteSltrLcMktDefById(String id){
        SltrLcMktDefVO vo = this.getSltrLcMktDefById(id);
        if(vo == null){
            throw new NullPointerException("Id is not defined" + id);
        }
        mapper.deleteSltrLcMktDefById(id);
        return vo;
    }

    // Get
    public SltrLcMktDefVO getSltrLcMktDefById(String id){
        return mapper.getSltrLcMktDefById(id);
    }
}

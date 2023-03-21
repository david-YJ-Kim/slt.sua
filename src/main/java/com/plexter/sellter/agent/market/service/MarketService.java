package com.plexter.sellter.agent.market.service;

import com.plexter.sellter.agent.market.mapper.MarketMapper;
import com.plexter.sellter.agent.market.vo.SltrLcMktDefVO;
import com.plexter.sellter.agent.util.ParsingCommonUtil;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
public class MarketService {

    @Mapper
    MarketMapper mapper;


    // Create
    public String saveSltrLcMktDef(SltrLcMktDefVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCMKDEF"));
        return mapper.saveSltrLcMktDef(vo);
    }

    // Update
    public SltrLcMktDefVO updateSltrLcMktDef(SltrLcMktDefVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        return mapper.updateSltrLcMktDef(vo);
    }


    // Delete
    public SltrLcMktDefVO deleteSltrLcMktDefById(String id){
        return mapper.deleteSltrLcMktDefById(id);
    }
}

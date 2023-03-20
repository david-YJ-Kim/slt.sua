package com.plexter.sellter.agent.market.mapper;

import com.plexter.sellter.agent.market.vo.SltrLcMktDefVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MarketMapper {

    // Create
    String saveSltrLcMktDef(SltrLcMktDefVO vo);

    // Update
    SltrLcMktDefVO updateSltrLcMktDef(SltrLcMktDefVO vo);

    // Delete
    SltrLcMktDefVO deleteSltrLcMktDefById(String id);
}

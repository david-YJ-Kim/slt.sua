package com.plexter.sellter.agent.market.mapper;

import com.plexter.sellter.agent.market.vo.SltrLcMktDefVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MarketMapper {

    // Create
    void saveSltrLcMktDef(SltrLcMktDefVO vo);

    // Update
    void updateSltrLcMktDef(SltrLcMktDefVO vo);

    // Delete
    void deleteSltrLcMktDefById(String id);

    // Get
    SltrLcMktDefVO getSltrLcMktDefById(String id);
}

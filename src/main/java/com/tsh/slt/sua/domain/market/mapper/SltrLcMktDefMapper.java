package com.tsh.slt.sua.domain.market.mapper;

import com.tsh.slt.sua.domain.market.vo.SltrLcMktDefVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SltrLcMktDefMapper {

    // Create
    void saveSltrLcMktDef(SltrLcMktDefVO vo);

    // Update
    void updateSltrLcMktDef(SltrLcMktDefVO vo);

    // Delete
    void deleteSltrLcMktDefById(String id);

    // Get
    SltrLcMktDefVO getSltrLcMktDefById(String id);
}

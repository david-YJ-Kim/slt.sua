package com.plexter.sellter.agent.code.mapper;

import com.plexter.sellter.agent.code.vo.SltrLcCodeDefVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CodeMapper {

    // Create
    String saveSltrLcCodeDef(SltrLcCodeDefVO vo);

    // Update
    SltrLcCodeDefVO updateSltrLcCodeDef(SltrLcCodeDefVO vo);

    // delete
    SltrLcCodeDefVO deleteSltrLcCodeDefById(String id);
}

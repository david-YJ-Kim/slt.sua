package com.plexter.sellter.agent.code.mapper;

import com.plexter.sellter.agent.code.vo.SltrLcCodeDefVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CodeMapper {

    // Create
    void saveSltrLcCodeDef(SltrLcCodeDefVO vo);

    // Update
    void updateSltrLcCodeDef(SltrLcCodeDefVO vo);

    // delete
    void deleteSltrLcCodeDefById(String id);

    // get
    SltrLcCodeDefVO getSltrLcCodeDefById(String id);
}

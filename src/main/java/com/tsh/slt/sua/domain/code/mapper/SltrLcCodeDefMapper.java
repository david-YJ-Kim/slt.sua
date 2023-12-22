package com.tsh.slt.sua.domain.code.mapper;

import com.tsh.slt.sua.domain.code.vo.SltrLcCodeDefVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SltrLcCodeDefMapper {

    // Create
    void saveSltrLcCodeDef(SltrLcCodeDefVO vo);

    // Update
    void updateSltrLcCodeDef(SltrLcCodeDefVO vo);

    // delete
    void deleteSltrLcCodeDefById(String id);

    // get
    SltrLcCodeDefVO getSltrLcCodeDefById(String id);
}

package com.tsh.slt.sua.domain.keyword.mapper;

import com.tsh.slt.sua.domain.keyword.vo.SltrLcKeywordVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SltrLcKeywordMapper {

    // Create
    void saveSltrLcKeyword(SltrLcKeywordVO vo);

    // Update
    void updateSltrLcKeyword(SltrLcKeywordVO vo);

    // Delete by Id.
    void deleteSltrLcKeywordById(String id);

    SltrLcKeywordVO getSltrLcKeywordById(String id);
}

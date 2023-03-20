package com.plexter.sellter.agent.keyword.mapper;

import com.plexter.sellter.agent.keyword.vo.SltrLcKeywordVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface KeywordMapper {

    // Create
    String saveSltrLcKeyword(SltrLcKeywordVO vo);

    // Update
    SltrLcKeywordVO updateSltrLcKeyword(SltrLcKeywordVO vo);

    // Delete by Id.
    SltrLcKeywordVO deleteSltrLcKeywordById(String id);
}

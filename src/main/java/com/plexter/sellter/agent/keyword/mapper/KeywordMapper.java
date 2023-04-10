package com.plexter.sellter.agent.keyword.mapper;

import com.plexter.sellter.agent.keyword.vo.SltrLcKeywordVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface KeywordMapper {

    // Create
    void saveSltrLcKeyword(SltrLcKeywordVO vo);

    // Update
    void updateSltrLcKeyword(SltrLcKeywordVO vo);

    // Delete by Id.
    void deleteSltrLcKeywordById(String id);

    SltrLcKeywordVO getSltrLcKeywordById(String id);
}

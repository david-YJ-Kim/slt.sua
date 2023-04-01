package com.plexter.sellter.agent.user.mapper;

import com.plexter.sellter.agent.user.vo.SltrLcImgDtlVO;
import com.plexter.sellter.agent.user.vo.SltrLcUserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    SltrLcUserVO selectSltrLcUser(String userId);

    // Create
    void saveSltrLcImgDtl(SltrLcImgDtlVO vo);
    void saveSltrLcUser(SltrLcUserVO vo);

    // Update
    SltrLcImgDtlVO updateSltrLcImgDtl(SltrLcImgDtlVO vo);
    void updateSltrLcUser(SltrLcUserVO vo);

    // Delete By Id
    SltrLcImgDtlVO deleteSltrLcImgDtlById(String id);
    SltrLcUserVO deleteSltrLcUserById(String id);
}

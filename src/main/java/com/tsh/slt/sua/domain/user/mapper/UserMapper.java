package com.tsh.slt.sua.domain.user.mapper;

import com.tsh.slt.sua.domain.user.vo.SltrLcImgDtlVO;
import com.tsh.slt.sua.domain.user.vo.SltrLcUserVO;
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

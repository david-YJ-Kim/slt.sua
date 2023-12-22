package com.tsh.slt.sua.domain.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper {

    // String 대신 VO로, VO을 이용해서  in, out 설정
//    List<MyAllApiListVo> selectMyAllApiList(UserInfoVo paramVo);
    String[] selectMyAllApiList();
}

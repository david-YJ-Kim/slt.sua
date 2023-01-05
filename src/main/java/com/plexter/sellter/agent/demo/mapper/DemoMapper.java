package com.plexter.sellter.agent.demo.mapper;

import com.plexter.sellter.agent.demo.vo.MyAllApiListVo;
import com.plexter.sellter.agent.module.vo.UserInfoVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DemoMapper {

    // String 대신 VO로, VO을 이용해서  in, out 설정
//    List<MyAllApiListVo> selectMyAllApiList(UserInfoVo paramVo);
    String[] selectMyAllApiList();
}

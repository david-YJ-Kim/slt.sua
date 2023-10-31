package com.tsh.slt.agent.domain.main.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface QueryServiceMapper {

    @Select("${query}")
    List<Map<String, Object>> execute(String query);
}

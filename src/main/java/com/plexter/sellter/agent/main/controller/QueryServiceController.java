package com.plexter.sellter.agent.main.controller;

import com.plexter.sellter.agent.main.mapper.QueryServiceMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class QueryServiceController {


    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @PostMapping("/queryService")
    public List<Map<String, Object>> executeQuery(@RequestBody String query){
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            QueryServiceMapper mapper = sqlSession.getMapper(QueryServiceMapper.class);
            String modifiedQuery = StringUtils.normalizeSpace(query.replaceAll("\"", ""));
            modifiedQuery.replaceAll("(\r\n|\r|\n|\n\r)", "");


            System.out.println(modifiedQuery);
            List<Map<String, Object>> ResultSet = mapper.execute(modifiedQuery);
            System.out.println(ResultSet.toString());
            return ResultSet;
        }


    }
}


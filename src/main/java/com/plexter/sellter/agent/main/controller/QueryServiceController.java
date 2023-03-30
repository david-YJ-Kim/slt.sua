package com.plexter.sellter.agent.main.controller;

import com.plexter.sellter.agent.main.mapper.QueryServiceMapper;
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
            System.out.println(query.replaceAll("\"", ""));

            return mapper.execute(query.replaceAll("\"", ""));
        }


    }
}


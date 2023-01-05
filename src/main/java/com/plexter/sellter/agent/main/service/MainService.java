package com.plexter.sellter.agent.main.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private SqlSessionTemplate sqlSession;

    public String getTest(){
        return "test";

    }
}

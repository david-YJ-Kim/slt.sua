package com.tsh.slt.sua.domain.main.service;

import com.tsh.slt.sua.domain.main.vo.MonthlyRecordListVo;
import com.tsh.slt.sua.domain.main.mapper.MainMapper;
import com.tsh.slt.sua.domain.main.vo.MonthRecordListVo;
import com.tsh.slt.sua.domain.main.vo.OrderDashBoardListVo;
import com.tsh.slt.sua.domain.main.vo.TopSellingItemListVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    private SqlSessionTemplate sqlSession;
    @Autowired
    MainMapper mainMapper;


    public List<MonthRecordListVo> getMonthRecord(String userId){
        return mainMapper.getMonthRecordList(userId);
    }


    public List<MonthlyRecordListVo> getMonthlyRecord(String userId){
        return mainMapper.getMonthlyRecordList(userId);
    }

    public List<TopSellingItemListVo> getTopSellingItemList(String userId){
        return mainMapper.getTopSellingItemList(userId);
    }

    public List<OrderDashBoardListVo> getOrderDashBoard(String userId){
        return mainMapper.getOrderDashBoard(userId);
    }

    public String getTest(){
        return "test";

    }
}

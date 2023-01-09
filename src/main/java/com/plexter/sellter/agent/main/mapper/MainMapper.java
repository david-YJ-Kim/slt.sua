package com.plexter.sellter.agent.main.mapper;

import com.plexter.sellter.agent.main.vo.MonthRecordListVo;
import com.plexter.sellter.agent.main.vo.MonthlyRecordListVo;
import com.plexter.sellter.agent.main.vo.OrderDashBoardListVo;
import com.plexter.sellter.agent.main.vo.TopSellingItemListVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {

    List<MonthRecordListVo> getMonthRecordList(String userId);

    List<MonthlyRecordListVo> getMonthlyRecordList(String userId);

    List<TopSellingItemListVo> getTopSellingItemList(String userId);

    List<OrderDashBoardListVo> getOrderDashBoard(String userId);
}

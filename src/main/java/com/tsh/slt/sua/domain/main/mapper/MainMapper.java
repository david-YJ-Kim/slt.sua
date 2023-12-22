package com.tsh.slt.sua.domain.main.mapper;

import com.tsh.slt.sua.domain.main.vo.MonthlyRecordListVo;
import com.tsh.slt.sua.domain.main.vo.MonthRecordListVo;
import com.tsh.slt.sua.domain.main.vo.OrderDashBoardListVo;
import com.tsh.slt.sua.domain.main.vo.TopSellingItemListVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {

    List<MonthRecordListVo> getMonthRecordList(String userId);

    List<MonthlyRecordListVo> getMonthlyRecordList(String userId);

    List<TopSellingItemListVo> getTopSellingItemList(String userId);

    List<OrderDashBoardListVo> getOrderDashBoard(String userId);
}

package com.plexter.sellter.agent.main.controller;

import com.plexter.sellter.agent.main.service.MainService;
import com.plexter.sellter.agent.main.vo.MonthRecordListVo;
import com.plexter.sellter.agent.main.vo.MonthlyRecordListVo;
import com.plexter.sellter.agent.main.vo.OrderDashBoardListVo;
import com.plexter.sellter.agent.main.vo.TopSellingItemListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales/summary")
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "/getMonthRecord/{id}", method = RequestMethod.GET)
    public List<MonthRecordListVo> getMonthRecord(@PathVariable String id){
        return mainService.getMonthRecord(id);
    }

    @RequestMapping(value = "/getMonthlyRecord/{id}", method = RequestMethod.GET)
    public List<MonthlyRecordListVo> getMonthlyRecord(@PathVariable String id){
        return mainService.getMonthlyRecord(id);
    }
    @RequestMapping(value = "/getTopSellingItemList/{id}", method = RequestMethod.GET)
    public List<TopSellingItemListVo> getTopSellingItemList(@PathVariable String id){
        return mainService.getTopSellingItemList(id);
    }

    @RequestMapping(value = "getOrderDashBoard/{id}", method = RequestMethod.GET)
    public List<OrderDashBoardListVo> getOrderDashBoard(@PathVariable String id){
        return mainService.getOrderDashBoard(id);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getQueryResult() {

        return mainService.getTest();
    }



}

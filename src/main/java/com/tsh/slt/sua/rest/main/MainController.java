package com.tsh.slt.sua.rest.main;

import com.tsh.slt.sua.domain.main.vo.MonthlyRecordListVo;
import com.tsh.slt.sua.domain.main.service.MainService;
import com.tsh.slt.sua.domain.main.vo.MonthRecordListVo;
import com.tsh.slt.sua.domain.main.vo.OrderDashBoardListVo;
import com.tsh.slt.sua.domain.main.vo.TopSellingItemListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales/summary")
public class MainController {

    @Autowired
    private MainService mainService;

//    @Autowired
//    private JmsRequestUtil jmsRequestUtil;

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

    @RequestMapping(value = "/getOrderDashBoard/{id}", method = RequestMethod.GET)
    public List<OrderDashBoardListVo> getOrderDashBoard(@PathVariable String id){
        return mainService.getOrderDashBoard(id);
    }

//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    public String getQueryResult() throws JMSException {
//
//        jmsRequestUtil.sendScrapRequest("payload");
//        return "";
////        return mainService.getTest();
//    }


    @RequestMapping(value = "/test", method = RequestMethod.POST)
//    public void postTest(HttpServletRequest request) {
//    public void postTest(@RequestBody HashMap<String, Object> map) {
//        public void postTest(@RequestBody String map) {
    public void postTest(String body) {
        System.out.println(body);
    }


//        String body = null;
//        StringBuilder stringBuilder = new StringBuilder();
//        BufferedReader bufferedReader = null;
//
//        try {
//            InputStream inputStream = request.getInputStream();
//            if (inputStream != null) {
//                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//                char[] charBuffer = new char[128];
//                int bytesRead = -1;
//                while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
//                    stringBuilder.append(charBuffer, 0, bytesRead);
//                }
//            }
//        } catch (IOException ex) {
//        } finally {
//            if (bufferedReader != null) {
//                try {
//                    bufferedReader.close();
//                } catch (IOException ex) {
//                }
//            }
//        }
//
//        body = stringBuilder.toString();
//        System.out.println(body);
//    }



}

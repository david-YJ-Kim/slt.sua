package com.tsh.slt.agent.domain.demo.service;

import com.tsh.slt.agent.domain.demo.mapper.DemoMapper;
import com.tsh.slt.agent.domain.demo.vo.MyAllApiListVo;
import com.tsh.slt.agent.domain.module.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DemoService {

    @Autowired
    DemoMapper demoMapper;


    // Return Data Type 혹은 parameter VO 선언하면됨
    public List<MyAllApiListVo> getMyAllApiList(UserInfoVo paramVo) {
//        return demoMapper.selectMyAllApiList(paramVo);
//        System.out.println(demoMapper.selectMyAllApiList(paramVo).toString());
//        System.out.println(demoMapper.selectMyAllApiList("USER_10001"));
        System.out.println(Arrays.toString(demoMapper.selectMyAllApiList()));
        MyAllApiListVo vo = new MyAllApiListVo();
        vo.setTGT_API_ID("TST_API_ID");
        vo.setREQ_SYS_ID("TST_SYS_ID");
        vo.setOPEN_API_NM("API_NM");
        vo.setOPEN_API_DESC(Arrays.toString(demoMapper.selectMyAllApiList()));
        vo.setHTTP_URL("/openapi/url");
        vo.setHTTP_METHOD_TYP("GET");
        vo.setCRT_USER_NM("David");
        vo.setCRT_USER_ID("TSDAVID");
        vo.setCRT_DT("2023-01-05");
        vo.setCHG_DT("2023-01-05");

        ArrayList<MyAllApiListVo> val = new ArrayList<>();
        val.add(vo);

        return val;
    }
}

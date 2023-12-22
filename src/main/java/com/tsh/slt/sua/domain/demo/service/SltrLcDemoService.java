package com.tsh.slt.sua.domain.demo.service;

import com.tsh.slt.sua.domain.demo.mapper.DemoMapper;
import com.tsh.slt.sua.domain.demo.model.SltrLcDemoDef;
import com.tsh.slt.sua.domain.demo.vo.MyAllApiListVo;
import com.tsh.slt.sua.domain.module.vo.UserInfoVo;
import com.tsh.slt.sua.util.common.dto.CommonDto;
import com.tsh.slt.sua.util.common.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class SltrLcDemoService implements CommonService<SltrLcDemoDef> {

    @Autowired
    DemoMapper demoMapper;


    /**
     * ########################################################################
     * SAVE
     * ########################################################################
     */

    @Override
    public SltrLcDemoDef saveEntity(CommonDto saveRequestDto) {
        return null;
    }

    /**
     * ########################################################################
     * GET
     * ########################################################################
     */

    @Override
    public Optional<SltrLcDemoDef> getEntityByObjId(String objId) {
        return Optional.empty();
    }


    /**
     * ########################################################################
     * UPDATE
     * ########################################################################
     */
    @Override
    public void deleteEntities(Iterable<SltrLcDemoDef> deleteIterator) {

    }

    @Override
    public void deleteEntitiesInBatch(Iterable<SltrLcDemoDef> deleteIterator) {

    }

    @Override
    public void deleteEntitiesByObjId(String objId) {

    }

    @Override
    public void deleteAllEntities() {

    }

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

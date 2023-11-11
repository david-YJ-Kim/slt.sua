package com.tsh.slt.agent.domain.code.service;

import com.tsh.slt.agent.domain.code.mapper.SltrLcCodeDefMapper;
import com.tsh.slt.agent.domain.code.model.SltrLcCodeDef;
import com.tsh.slt.agent.domain.code.repository.SltrLcCodeDefRepository;
import com.tsh.slt.agent.domain.code.vo.SltrLcCodeDefVO;
import com.tsh.slt.agent.domain.code.vo.dto.SltrLcCodeDefSaveRequestDto;
import com.tsh.slt.agent.util.ParsingCommonUtil;
import com.tsh.slt.agent.util.common.dto.CommonDto;
import com.tsh.slt.agent.util.common.service.CommonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class SltrLcCodeDefService implements CommonService<SltrLcCodeDef> {
    private final SltrLcCodeDefRepository repository;

    @Autowired
    SltrLcCodeDefMapper codeMapper;


    public String saveSltrLcCodeDef(SltrLcCodeDefVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCCR"));

        System.out.println(vo.toString());
        codeMapper.saveSltrLcCodeDef(vo);
        return vo.getOBJ_ID();
    }

    public SltrLcCodeDefVO updateSltrLcCodeDef(SltrLcCodeDefVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        codeMapper.updateSltrLcCodeDef(vo);
        System.out.println(codeMapper.getSltrLcCodeDefById(vo.getOBJ_ID()));
        return codeMapper.getSltrLcCodeDefById(vo.getOBJ_ID());
    }

    public SltrLcCodeDefVO deleteSltrLcCodeDefById(String id){
        SltrLcCodeDefVO vo = this.getltrLcCodeDefById(id);
        if(vo == null){
            throw new NullPointerException("Id is not defined. " + id);
        }
        codeMapper.deleteSltrLcCodeDefById(id);
        return  vo;
    }

    public SltrLcCodeDefVO getltrLcCodeDefById(String id){
        return codeMapper.getSltrLcCodeDefById(id);
    }

    @Override
    public SltrLcCodeDef saveEntity(CommonDto saveRequestDto) {
        SltrLcCodeDefSaveRequestDto dto = (SltrLcCodeDefSaveRequestDto) saveRequestDto;
        return this.repository.save(dto.toEntity());
    }

    @Override
    public Optional<SltrLcCodeDef> getEntityByObjId(String objId) {
        return this.repository.findById(objId);
    }

    @Override
    public void deleteEntities(Iterable<SltrLcCodeDef> deleteIterator) {
        this.repository.deleteAll(deleteIterator);
    }

    @Override
    public void deleteEntitiesInBatch(Iterable<SltrLcCodeDef> deleteIterator) {
        this.repository.deleteAllInBatch(deleteIterator);
    }

    @Override
    public void deleteEntitiesByObjId(String objId) {
        this.repository.deleteById(objId);
    }

    @Override
    public void deleteAllEntities() {

    }
}


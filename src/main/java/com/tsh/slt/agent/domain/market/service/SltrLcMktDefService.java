package com.tsh.slt.agent.domain.market.service;

import com.tsh.slt.agent.domain.market.mapper.SltrLcMktDefMapper;
import com.tsh.slt.agent.domain.market.model.SltrLcMktDef;
import com.tsh.slt.agent.domain.market.repository.SltrLcMktDefRepository;
import com.tsh.slt.agent.domain.market.vo.SltrLcMktDefVO;
import com.tsh.slt.agent.domain.market.vo.dto.SltrLcMktDefSaveRequestDto;
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
public class SltrLcMktDefService implements CommonService<SltrLcMktDef> {
    private final SltrLcMktDefRepository repository;

    @Autowired
    SltrLcMktDefMapper mapper;


    // Create
    public String saveSltrLcMktDef(SltrLcMktDefVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCMKDEF"));
        mapper.saveSltrLcMktDef(vo);
        return vo.getOBJ_ID();
    }

    // Update
    public SltrLcMktDefVO updateSltrLcMktDef(SltrLcMktDefVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        mapper.updateSltrLcMktDef(vo);
        return this.getSltrLcMktDefById(vo.getOBJ_ID());
    }


    // Delete
    public SltrLcMktDefVO deleteSltrLcMktDefById(String id){
        SltrLcMktDefVO vo = this.getSltrLcMktDefById(id);
        if(vo == null){
            throw new NullPointerException("Id is not defined" + id);
        }
        mapper.deleteSltrLcMktDefById(id);
        return vo;
    }

    // Get
    public SltrLcMktDefVO getSltrLcMktDefById(String id){
        return mapper.getSltrLcMktDefById(id);
    }

    @Override
    public SltrLcMktDef saveEntity(CommonDto saveRequestDto) {
        SltrLcMktDefSaveRequestDto dto = (SltrLcMktDefSaveRequestDto) saveRequestDto;
        return this.repository.save(dto.toEntity());
    }

    @Override
    public Optional<SltrLcMktDef> getEntityByObjId(String objId) {
        return this.repository.findById(objId);
    }

    @Override
    public void deleteEntities(Iterable<SltrLcMktDef> deleteIterator) {
        this.repository.deleteAll(deleteIterator);

    }

    @Override
    public void deleteEntitiesInBatch(Iterable<SltrLcMktDef> deleteIterator) {
        this.repository.deleteAllInBatch(deleteIterator);
    }

    @Override
    public void deleteEntitiesByObjId(String objId) {
        this.repository.deleteById(objId);
    }

    public void deleteAllEntities(){
        this.repository.deleteAll();
    }
}

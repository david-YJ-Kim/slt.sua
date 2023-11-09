package com.tsh.slt.agent.domain.bizAccount.service;

import com.tsh.slt.agent.domain.bizAccount.mapper.SltrLcBizDefMapper;
import com.tsh.slt.agent.domain.bizAccount.model.SltrLcBizDef;
import com.tsh.slt.agent.domain.bizAccount.repository.SltrLcBizDefRepository;
import com.tsh.slt.agent.domain.bizAccount.vo.SltrLcBizDefVO;
import com.tsh.slt.agent.domain.bizAccount.vo.SltrLcBizMktRelVO;
import com.tsh.slt.agent.domain.bizAccount.vo.dto.SltrLcBizDefSaveRequestDto;
import com.tsh.slt.agent.util.ParsingCommonUtil;
import com.tsh.slt.agent.util.code.TableKeyCode;
import com.tsh.slt.agent.util.common.dto.CommonDto;
import com.tsh.slt.agent.util.common.service.CommonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class SltrLcBizDefService implements CommonService<SltrLcBizDef> {
    private final SltrLcBizDefRepository repository;


    @Autowired
    SltrLcBizDefMapper bizAccountMapper;

    // insert
    public String saveSltrLcBizDef(SltrLcBizDefVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId(TableKeyCode.SLTR_TBL_011.name()));
        System.out.println(vo.toString());

        bizAccountMapper.saveSltrLcBizDef(vo);
        return vo.getOBJ_ID();
    }

    public String saveSltrBizMktRel(SltrLcBizMktRelVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId(TableKeyCode.SLTR_TBL_012.name()));
        bizAccountMapper.saveSltrBizMktRel(vo);
        return vo.getOBJ_ID();
    }

    // update
    public SltrLcBizDefVO updateSltrLcBizDef(SltrLcBizDefVO vo){
        System.out.println(" Update Service : " + vo.toString());
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        bizAccountMapper.updateSltrLcBizDef(vo);
        return bizAccountMapper.getSltrLcBizDefById(vo.getOBJ_ID());
    }

    public SltrLcBizMktRelVO updateSltrBizMktRel(SltrLcBizMktRelVO vo){
        System.out.println(" Update Service : " + vo.toString());
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        bizAccountMapper.updateSltrBizMktRel(vo);

        return bizAccountMapper.getSltrBizMktRelById(vo.getOBJ_ID());
    }

    // delete

    public SltrLcBizDefVO deleteSltrLcBizDefById(String id){
        SltrLcBizDefVO vo = this.getSltrLcBizDefById(id);
        if(vo == null){
            throw new NullPointerException("Id is not defined" + id);
        }
        bizAccountMapper.deleteSltrLcBizDefById(id);
        System.out.println(vo.toString());
        return vo;
    }

    public SltrLcBizMktRelVO deleteSltrBizMktRelById(String id){
        SltrLcBizMktRelVO vo = this.getSltrBizMktRelById(id);
        if(vo == null){
            throw new NullPointerException("Id is not defined" + id);
        }
        bizAccountMapper.deleteSltrBizMktRelById(id);
        return vo;
    }

    // get
    public SltrLcBizDefVO getSltrLcBizDefById(String id){
        return bizAccountMapper.getSltrLcBizDefById(id);
    }

    public SltrLcBizMktRelVO getSltrBizMktRelById(String id){
        return bizAccountMapper.getSltrBizMktRelById(id);
    }

    @Override
    public SltrLcBizDef saveEntity(CommonDto saveRequestDto) {
        SltrLcBizDefSaveRequestDto dto = (SltrLcBizDefSaveRequestDto) saveRequestDto;
        return this.repository.save(dto.toEntity());
    }

    @Override
    public Optional<SltrLcBizDef> getEntityByObjId(String objId) {
        return this.repository.findById(objId);
    }

    @Override
    public void deleteEntities(Iterable<SltrLcBizDef> deleteIterator) {
        this.repository.deleteAll(deleteIterator);
    }

    @Override
    public void deleteEntitiesInBatch(Iterable<SltrLcBizDef> deleteIterator) {
        this.repository.deleteAllInBatch(deleteIterator);
    }

    @Override
    public void deleteEntitiesByObjId(String objId) {
        this.repository.deleteById(objId);
    }

    @Override
    public void deleteAllEntities() {
        this.repository.deleteAll();
    }
}

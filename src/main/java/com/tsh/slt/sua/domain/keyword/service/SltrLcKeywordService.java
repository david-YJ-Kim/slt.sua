package com.tsh.slt.sua.domain.keyword.service;

import com.tsh.slt.sua.domain.keyword.mapper.SltrLcKeywordMapper;
import com.tsh.slt.sua.domain.keyword.model.SltrLcKeyword;
import com.tsh.slt.sua.domain.keyword.repository.SltrLcKeywordRepository;
import com.tsh.slt.sua.domain.keyword.vo.SltrLcKeywordVO;
import com.tsh.slt.sua.domain.keyword.vo.dto.SltrLcKeywordSaveRequestDto;
import com.tsh.slt.sua.util.ParsingCommonUtil;
import com.tsh.slt.sua.util.common.dto.CommonDto;
import com.tsh.slt.sua.util.common.service.CommonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class SltrLcKeywordService implements CommonService<SltrLcKeyword> {
    private final SltrLcKeywordRepository repository;


    @Autowired
    SltrLcKeywordMapper keywordMapper;

    public String saveSltrLcKeyword(SltrLcKeywordVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCKWO"));
        keywordMapper.saveSltrLcKeyword(vo);
//        scrapServiceManager.receiveOrderSheet(vo);

        return vo.getOBJ_ID();
    }

    public SltrLcKeywordVO updateSltrLcKeyword(SltrLcKeywordVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        keywordMapper.updateSltrLcKeyword(vo);
        return keywordMapper.getSltrLcKeywordById(vo.getOBJ_ID());
    }

    public SltrLcKeywordVO deleteSltrLcKeywordById(String id){
        SltrLcKeywordVO vo = this.getSltrLcKeywordById(id);
        if(vo == null){
            throw new NullPointerException("Id is not defined. " + id);
        }
        keywordMapper.deleteSltrLcKeywordById(id);
        return keywordMapper.getSltrLcKeywordById(vo.getOBJ_ID());
    }

    public SltrLcKeywordVO getSltrLcKeywordById(String id){
        System.out.println(id);
        return keywordMapper.getSltrLcKeywordById(id);
    }

    @Override
    public SltrLcKeyword saveEntity(CommonDto saveRequestDto) {
        SltrLcKeywordSaveRequestDto dto = (SltrLcKeywordSaveRequestDto) saveRequestDto;
        return this.repository.save(dto.toEntity());
    }

    @Override
    public Optional<SltrLcKeyword> getEntityByObjId(String objId) {
        return this.repository.findById(objId);
    }

    @Override
    public void deleteEntities(Iterable<SltrLcKeyword> deleteIterator) {
        this.repository.deleteAll(deleteIterator);

    }

    @Override
    public void deleteEntitiesInBatch(Iterable<SltrLcKeyword> deleteIterator) {
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

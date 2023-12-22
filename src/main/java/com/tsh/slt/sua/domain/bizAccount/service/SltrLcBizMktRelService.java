package com.tsh.slt.sua.domain.bizAccount.service;

import com.tsh.slt.sua.domain.bizAccount.model.SltrLcBizMktRel;
import com.tsh.slt.sua.domain.bizAccount.repository.SltrLcBizMktRelRepository;
import com.tsh.slt.sua.domain.bizAccount.vo.dto.SltrLcBizMktRelSaveRequestDto;
import com.tsh.slt.sua.util.common.dto.CommonDto;
import com.tsh.slt.sua.util.common.service.CommonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class SltrLcBizMktRelService implements CommonService<SltrLcBizMktRel> {
    private final SltrLcBizMktRelRepository repository;

    @Override
    public SltrLcBizMktRel saveEntity(CommonDto saveRequestDto) {
        SltrLcBizMktRelSaveRequestDto dto = (SltrLcBizMktRelSaveRequestDto) saveRequestDto;
        return this.repository.save(dto.toEntity());
    }

    @Override
    public Optional<SltrLcBizMktRel> getEntityByObjId(String objId) {
        return this.repository.findById(objId);
    }

    @Override
    public void deleteEntities(Iterable<SltrLcBizMktRel> deleteIterator) {
        this.repository.deleteAll(deleteIterator);
    }

    @Override
    public void deleteEntitiesInBatch(Iterable<SltrLcBizMktRel> deleteIterator) {
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

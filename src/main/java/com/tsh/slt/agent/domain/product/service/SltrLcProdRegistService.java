package com.tsh.slt.agent.domain.product.service;

import com.tsh.slt.agent.domain.product.model.SltrLcProdRegist;
import com.tsh.slt.agent.domain.product.repository.SltrLcProdRegistRepository;
import com.tsh.slt.agent.domain.product.vo.dto.SltrLcProdRegistSaveRequestDto;
import com.tsh.slt.agent.util.common.dto.CommonDto;
import com.tsh.slt.agent.util.common.service.CommonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class SltrLcProdRegistService implements CommonService<SltrLcProdRegist> {
    private final SltrLcProdRegistRepository repository;
    @Override
    public SltrLcProdRegist saveEntity(CommonDto saveRequestDto) {
        SltrLcProdRegistSaveRequestDto dto = (SltrLcProdRegistSaveRequestDto) saveRequestDto;
        return this.repository.save(dto.toEntity());
    }

    @Override
    public Optional<SltrLcProdRegist> getEntityByObjId(String objId) {
        return this.repository.findById(objId);
    }

    @Override
    public void deleteEntities(Iterable<SltrLcProdRegist> deleteIterator) {
        this.repository.deleteAll(deleteIterator);

    }

    @Override
    public void deleteEntitiesInBatch(Iterable<SltrLcProdRegist> deleteIterator) {
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

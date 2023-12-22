package com.tsh.slt.sua.domain.product.service;

import com.tsh.slt.sua.domain.product.model.SltrLcProdDtl;
import com.tsh.slt.sua.domain.product.repository.SltrLcProdDtlRepository;
import com.tsh.slt.sua.domain.product.vo.dto.SltrLcProdDtlSaveRequestDto;
import com.tsh.slt.sua.util.common.dto.CommonDto;
import com.tsh.slt.sua.util.common.service.CommonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class SltrLcProdDtlService implements CommonService<SltrLcProdDtl> {
    private final SltrLcProdDtlRepository repository;

    @Override
    public SltrLcProdDtl saveEntity(CommonDto saveRequestDto) {
        SltrLcProdDtlSaveRequestDto dto = (SltrLcProdDtlSaveRequestDto) saveRequestDto;
        return this.repository.save(dto.toEntity());
    }

    @Override
    public Optional<SltrLcProdDtl> getEntityByObjId(String objId) {
        return this.repository.findById(objId);
    }

    @Override
    public void deleteEntities(Iterable<SltrLcProdDtl> deleteIterator) {
        this.repository.deleteAll(deleteIterator);

    }

    @Override
    public void deleteEntitiesInBatch(Iterable<SltrLcProdDtl> deleteIterator) {
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

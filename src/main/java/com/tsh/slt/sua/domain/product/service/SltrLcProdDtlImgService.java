package com.tsh.slt.sua.domain.product.service;

import com.tsh.slt.sua.domain.product.model.SltrLcProdDtlImg;
import com.tsh.slt.sua.domain.product.repository.SltrLcProdDtlImgRepository;
import com.tsh.slt.sua.domain.product.vo.dto.SltrLcProdDtlImgSaveRequestDto;
import com.tsh.slt.sua.util.common.dto.CommonDto;
import com.tsh.slt.sua.util.common.service.CommonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class SltrLcProdDtlImgService implements CommonService<SltrLcProdDtlImg> {
    private final SltrLcProdDtlImgRepository repository;

    @Override
    public SltrLcProdDtlImg saveEntity(CommonDto saveRequestDto) {
        SltrLcProdDtlImgSaveRequestDto dto = (SltrLcProdDtlImgSaveRequestDto) saveRequestDto;
        return this.repository.save(dto.toEntity());
    }

    @Override
    public Optional<SltrLcProdDtlImg> getEntityByObjId(String objId) {
        return this.repository.findById(objId);
    }

    @Override
    public void deleteEntities(Iterable<SltrLcProdDtlImg> deleteIterator) {
        this.repository.deleteAll(deleteIterator);

    }

    @Override
    public void deleteEntitiesInBatch(Iterable<SltrLcProdDtlImg> deleteIterator) {
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

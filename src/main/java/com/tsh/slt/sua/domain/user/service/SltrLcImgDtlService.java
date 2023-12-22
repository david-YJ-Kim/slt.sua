package com.tsh.slt.sua.domain.user.service;

import com.tsh.slt.sua.domain.user.model.SltrLcImgDtl;
import com.tsh.slt.sua.domain.user.repository.SltrLcImgDtlRepository;
import com.tsh.slt.sua.domain.user.vo.dto.SltrLcImgDtlSaveRequestDto;
import com.tsh.slt.sua.util.common.dto.CommonDto;
import com.tsh.slt.sua.util.common.service.CommonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class SltrLcImgDtlService implements CommonService<SltrLcImgDtl> {
    private final SltrLcImgDtlRepository repository;

    @Override
    public SltrLcImgDtl saveEntity(CommonDto saveRequestDto) {
        SltrLcImgDtlSaveRequestDto dto = (SltrLcImgDtlSaveRequestDto) saveRequestDto;
        return this.repository.save(dto.toEntity());
    }

    @Override
    public Optional<SltrLcImgDtl> getEntityByObjId(String objId) {
        return this.repository.findById(objId);
    }

    @Override
    public void deleteEntities(Iterable<SltrLcImgDtl> deleteIterator) {
        this.repository.deleteAll(deleteIterator);

    }

    @Override
    public void deleteEntitiesInBatch(Iterable<SltrLcImgDtl> deleteIterator) {
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

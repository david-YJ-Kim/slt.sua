package com.tsh.slt.sua.util.common.service;

import com.tsh.slt.sua.util.common.dto.CommonDto;

import java.util.Optional;

public interface CommonService<T> {


    T saveEntity(CommonDto saveRequestDto);

    Optional<T> getEntityByObjId(String objId);

    public void deleteEntities(Iterable<T> deleteIterator);

    void deleteEntitiesInBatch(Iterable<T> deleteIterator);

    void deleteEntitiesByObjId(String objId);

    void deleteAllEntities();

}

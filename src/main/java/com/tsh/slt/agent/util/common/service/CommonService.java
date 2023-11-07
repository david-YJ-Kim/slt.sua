package com.tsh.slt.agent.util.common.service;

import com.tsh.slt.agent.util.CommonDto;

import java.util.Optional;

public interface CommonService<T> {


    T saveEntity(CommonDto saveRequestDto);

    Optional<T> getEntityByObjId(String objId);

    public void deleteEntities(Iterable<T> deleteIterator);

    void deleteEntitiesInBatch(Iterable<T> deleteIterator);

    void deleteEntitiesByObjId(String objId);

    void deleteAllEntities();

}

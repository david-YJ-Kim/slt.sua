package com.tsh.slt.agent.util.common.service;

import com.tsh.slt.agent.util.common.model.CommonModel;

import java.util.Optional;

public interface CommonService {

    void deleteEntities(Iterable<CommonModel> deleteIterator);

    void deleteEntitiesInBatch(Iterable<Object> deleteIterator);

    void deleteEntitiesByObjId(String objId);

    void deleteAllEntities();

    Optional<Object> getEntityByObjId(String objId);

    Object saveEntity(Object saveRequestDto);

    Object updateEntity(Object updateRequestDto);
}

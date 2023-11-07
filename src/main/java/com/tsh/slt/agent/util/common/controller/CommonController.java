package com.tsh.slt.agent.util.common.controller;

import com.tsh.slt.agent.util.common.dto.CommonDto;
import org.springframework.http.ResponseEntity;

public interface CommonController<T> {

    ResponseEntity<T> saveEntity(CommonDto saveRequestDto);

    ResponseEntity<T> selectEntityByObjId(String objId);

    ResponseEntity<T> deleteEntityByObjId(String objId);
}

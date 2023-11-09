package com.tsh.slt.agent.util.common.dto;

public interface CommonDto<T> {

    public T toEntity();
    public String getSamplePayload();

    String getSamplePayload(String objId);
}

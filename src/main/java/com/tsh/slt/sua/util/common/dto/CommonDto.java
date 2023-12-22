package com.tsh.slt.sua.util.common.dto;

public interface CommonDto<T> {

    public T toEntity();
    public String getSamplePayload();

    String getSamplePayload(String objId);
}

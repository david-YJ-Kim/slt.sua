package com.tsh.slt.agent.util.common.dto;

public interface CommonDto {

    public Object toEntity();
    public String getSamplePayload();

    String getSamplePayload(String objId);
}

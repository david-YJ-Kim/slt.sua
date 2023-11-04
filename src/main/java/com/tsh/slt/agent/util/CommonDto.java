package com.tsh.slt.agent.util;

public interface CommonDto {

    public Object toEntity();
    public String getSamplePayload();

    String getSamplePayload(String objId);
}

package com.tsh.slt.agent.util;

public class SuaCommonUtil {

    public static String generateClientName(String groupName, String siteName, String envType, String processSeq){
        return String.format("%s-%s-%s-", groupName, siteName, envType) + String.format("%04d", Integer.valueOf(processSeq) );
    }
}

package com.tsh.slt.agent.domain.util;

public class ParsingCommonUtil {

    public static String generateObjId(String tableName){
        return tableName.concat(String.valueOf(System.currentTimeMillis()));
    }

}

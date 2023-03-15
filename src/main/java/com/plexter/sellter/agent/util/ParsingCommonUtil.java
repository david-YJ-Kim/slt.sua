package com.plexter.sellter.agent.util;

public class ParsingCommonUtil {

    public static String generateObjId(String tableName){
        return tableName.concat(String.valueOf(System.currentTimeMillis()));
    }

}

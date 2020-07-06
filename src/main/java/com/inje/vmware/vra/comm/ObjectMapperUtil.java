package com.inje.vmware.vra.comm;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class ObjectMapperUtil {
    private static ObjectMapper mapper = new ObjectMapper();

    public static <T> Object jsonStrConvertObject(Map target, Class<T> convertClass) {
        String responseBodyJson = null;
        Object result = null;

        try {
            responseBodyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(target);
            result = mapper.readValue(responseBodyJson, convertClass);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static <ConvertTarget, ConvertType> Object objectConvertMap(ConvertTarget convertTarget, Class<ConvertType> convertType) {
        ConvertType result = mapper.convertValue(convertTarget, convertType);
        return result;
    }

}
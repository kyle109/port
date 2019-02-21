package com.mtpinterface.util;

import java.util.LinkedHashMap;
import org.json.JSONObject;

public class JsonUtil {

    public static String mapTojson(LinkedHashMap<String, String> map) {

//        JSONObject jo = new JSONObject();
//
//        jo.put("map", map);
//
//        String json = jo.get("map").toString();
//
//        return json;


//        //net.sf.json.JSONObject 将Map转换为JSON方法
//        JSONObject json = JSONObject.fromObject(map);

        //org.json.JSONObject 将Map转换为JSON方法
        JSONObject json = new JSONObject(map);
        System.out.println(json.toString(4));

        return json.toString(4);
    }
}

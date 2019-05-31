package com.common.util;


import com.common.bean.ParameterizedTypeImpl;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JSONUtil {
    private static Gson gson;
    private static JsonParser jsonParser;

    public static void main(String[] args) {
        String xxx = "{\"cityKey\":[1,2],\"districtKey\":\"-1\",\"stationTypeKey\":\"-1\"}";
        JsonObject jsonObject = getJsonObject(xxx);
        JsonElement jsonElement = jsonObject.get("cityKey");
        String str = jsonElement.toString();
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        System.out.println();
    }


    public static Gson getGson() {
        if (gson == null) {
            gson = new GsonBuilder().serializeNulls().create();
        }
        return gson;
    }

    public static JsonParser getJsonParser() {
        if (jsonParser == null) {
            jsonParser = new JsonParser();
        }
        return jsonParser;
    }

    public static String toJson(Object object) {
        return getGson().toJson(object);
    }

    public static <T> T fromJson(String content, Type type) {
        return getGson().fromJson(content, type);
    }

    /**
     * 将json字符串解析成javabean
     *
     * @param jsonStr
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T getBean(String jsonStr, Class<T> tClass) {
        return getGson().fromJson(jsonStr, tClass);
    }

    public static <T> List<T> getBeanList(String jsonStr, Class<T> tClass) {

        Type type = new ParameterizedTypeImpl(new Class[]{tClass}, null, ArrayList.class);
        List<T> list = fromJson(jsonStr, type);
        if (list == null) {
            list = new ArrayList<>();
        }

        return list;
    }


    /**
     * 将json字符穿解析成JsonObject
     *
     * @param jsonStr
     * @return
     */
    public static JsonObject getJsonObject(String jsonStr) {
        return getJsonParser().parse(jsonStr).getAsJsonObject();
    }

    /**
     * 将json字符穿解析成JsonArray
     *
     * @param jsonStr
     * @return
     */
    public static JsonArray getJsonArray(String jsonStr) {
        return getJsonParser().parse(jsonStr).getAsJsonArray();
    }

    /**
     * 将JsonArray转换成List类型
     *
     * @param jsonArray
     * @return
     */
    public static List<Integer> getIntValues(JsonArray jsonArray) {
        List<Integer> intList = new ArrayList<>();
        for (Iterator<JsonElement> iterator = jsonArray.iterator(); iterator.hasNext(); ) {
            JsonElement jsonElement = iterator.next();
            intList.add(jsonElement.getAsInt());
        }
        return intList;
    }

    /**
     * 将JsonArray转换成List类型
     *
     * @param jsonArray
     * @return
     */
    public static List<String> getStringValues(JsonArray jsonArray) {
        List<String> intList = new ArrayList<>();
        for (Iterator<JsonElement> iterator = jsonArray.iterator(); iterator.hasNext(); ) {
            JsonElement jsonElement = iterator.next();
            intList.add(jsonElement.getAsString());
        }
        return intList;
    }

    /**
     * 获取JsonObject中key对应的String对象
     *
     * @param jsonObject
     * @param key
     * @return
     */
    public static String getAsString(JsonObject jsonObject, String key) {
        return jsonObject.get(key).getAsString();
    }

    public static String getAsNoNullString(JsonObject jsonObject, String key) {
        String result = null;
        JsonElement element = jsonObject.get(key);
        if (element != null) {
            result = element.toString();
            if ("null".equals(result)) {
                result = null;
            } else {
                result = element.getAsString();
            }
            if ("null".equals(result)){
                result = null;
            }
        }
        return result;
    }

    /**
     * 获取JsonObject中key对应的longg对象
     *
     * @param jsonObject
     * @param key
     * @return
     */
    public static long getAsLong(JsonObject jsonObject, String key) {
        return jsonObject.get(key).getAsLong();
    }

    /**
     * 获取JsonObject中key对应的int对象
     *
     * @param jsonObject
     * @param key
     * @return
     */
    public static int getAsInt(JsonObject jsonObject, String key) {
        return jsonObject.get(key).getAsInt();
    }

    /**
     * 获取JsonObject中key对应的char对象
     *
     * @param jsonObject
     * @param key
     * @return
     */
    public static char getAsChar(JsonObject jsonObject, String key) {
        return jsonObject.get(key).getAsCharacter();
    }

    /**
     * 获取JsonObject中key对应的boolean对象
     *
     * @param jsonObject
     * @param key
     * @return
     */
    public static boolean getAsBoolean(JsonObject jsonObject, String key) {
        return jsonObject.get(key).getAsBoolean();
    }

    /**
     * 获取JsonObject中key对应的double对象
     *
     * @param jsonObject
     * @param key
     * @return
     */
    public static double getAsDouble(JsonObject jsonObject, String key) {
        return jsonObject.get(key).getAsDouble();
    }

    /**
     * 获取JsonObject中key对应的BigDecimal对象
     *
     * @param jsonObject
     * @param key
     * @return
     */
    public static BigDecimal getAsBigDecimal(JsonObject jsonObject, String key) {
        return jsonObject.get(key).getAsBigDecimal();
    }

    /**
     * 获取JsonObject中key对应的JsonObject对象
     *
     * @param jsonObject
     * @param key
     * @return
     */
    public static JsonObject getAsJsonObject(JsonObject jsonObject, String key) {
        return jsonObject.get(key).getAsJsonObject();
    }

    /**
     * 获取JsonObject中key对应的JsonArray对象
     *
     * @param jsonObject
     * @param key
     * @return
     */
    public static JsonArray getAsJsonArray(JsonObject jsonObject, String key) {
        return jsonObject.get(key).getAsJsonArray();
    }

}
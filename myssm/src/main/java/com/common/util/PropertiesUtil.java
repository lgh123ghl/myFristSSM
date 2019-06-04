package com.common.util;

import java.io.InputStream;
import java.util.Properties;


/**
 * 读取配置文件的工具类
 */
public class PropertiesUtil {

    public PropertiesUtil(String fileClssPath){
        InputStream inputStream = PropertiesUtil.class.getResourceAsStream(fileClssPath);
        try {
            prop = new Properties();
            prop.load(inputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public String getString(String key){
        return prop.getProperty(key);
    }

    public static Properties prop = null;

    /**
     * 用法
     */
    public static void main(String[] args) {
        PropertiesUtil propertiesUtil = new PropertiesUtil("/config/db.properties");
        String url = propertiesUtil.getString("jdbc.url");
        System.out.println(url);
    }

}
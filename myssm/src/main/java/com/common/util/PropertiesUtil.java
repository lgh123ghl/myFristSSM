package com.common.util;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    public PropertiesUtil(){
        InputStream inputStream = PropertiesUtil.class.getResourceAsStream("/contants.properties");
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
/*    PropertiesUtil propertiesUtil = new PropertiesUtil();
    String url = propertiesUtil.getString("EIDP.HOST.CONTEXT") + propertiesUtil.getString("EIDP.WSDL.GETALLSTATIONS");*/
}
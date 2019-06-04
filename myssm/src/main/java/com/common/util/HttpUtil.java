package com.common.util;

import org.apache.commons.collections4.map.HashedMap;
import org.springframework.http.*;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Map;

/**  Http访问接口工具类
 * @author : 李光辉
 * @Date: 2019/3/18 10:17
 * @Description:
 */
public class HttpUtil {
    /**
     * 获取大数据接口
     * @param url
     * @param param
     * @return
     */
    public static String doPostForData(String url, Map<String, Object> param) {
        //String postUrl ="http://172.30.83.115:8080"+url;
        String postUrl ="http://172.30.92.25:8080"+url;
        //String postUrl ="http://172.30.9.158:8080"+url;
        try {
            SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
            // 设置建立连接超时时间
            requestFactory.setConnectTimeout(10000);
            // 设置等待返回超时时间
            requestFactory.setReadTimeout(20000);
            RestTemplate restTemplate = new RestTemplate(requestFactory);
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            HttpHeaders httpheader = new HttpHeaders();
            httpheader.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity httpEntity =  new HttpEntity<>(param, httpheader);
            ResponseEntity<String> responseEntity= restTemplate.exchange(postUrl, HttpMethod.POST,httpEntity,String.class);
            String result = responseEntity.getBody();
            return result;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return url;
    }

    public static String doPostForDataByMapStr(String url, Map<String,String> param) {
        //String postUrl = "http://172.30.83.115:8080" + url;
        String postUrl ="http://172.30.92.25:8080"+url;
        // String postUrl ="http://172.30.9.158:8080"+url;

        try {
            SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
            // 设置建立连接超时时间
            requestFactory.setConnectTimeout(10000);
            // 设置等待返回超时时间
            requestFactory.setReadTimeout(20000);
            RestTemplate restTemplate = new RestTemplate(requestFactory);
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            HttpHeaders httpheader = new HttpHeaders();
            httpheader.setContentType(MediaType.APPLICATION_JSON);
            ResponseEntity<String> responseEntity = restTemplate.exchange(postUrl, HttpMethod.POST, new HttpEntity<Map<String, String>>(param, httpheader), String.class);
            String result = responseEntity.getBody();
            return result;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return url;
    }

    public static List<Map<String, Object>> JsonToMapList(String url,Map<String,Object> map){
        return JSONUtil.getBean(doPostForData(url,map),List.class);
    }
    public static List<Map<String, String>> JsonToStringList(String url,Map<String,Object> map){
        return JSONUtil.getBean(doPostForData(url,map),List.class);
    }
    public static List<Map<String, String>> JsonToStringListByMapStr(String url,Map<String,String> map){
        return JSONUtil.getBean(doPostForDataByMapStr(url,map),List.class);
    }




    public static void main(String[] args) {
        String url = "/datainfo/findPowerLoop/monthly_Report_Concluding_Remarks";
        Map<String, Object> map = new HashedMap<>();
        map.put("site_id","211900010");
        map.put("time", "2019-03-21");
        map.put("testA","1");
        map.put("testB","1");
        map.put("MEASURETAG","GEN.P");
      /*  String doPoatForData = HttpUtil.doPostForData(url, map);
        List<PieData> pieDataList = JsonToBean(doPoatForData);
        for (PieData pieData:pieDataList) {
            System.out.println(pieData.getName()+"----"+pieData.getValue());
        }*/
    }
}

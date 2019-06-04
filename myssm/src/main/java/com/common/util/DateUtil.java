package com.common.util;

import com.alibaba.druid.util.StringUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *  时间格式工具
 * @author 李光辉
 */
public class DateUtil {

    private static final String FORMAT_YMD_HMS = "yyyy-MM-dd HH:mm:ss";
    private static final String FORMAT_YMD = "yyyy-MM-dd";
    private static final String FORMAT_YM = "yyyy-MM";
    private static final String FORMAT_YEAR = "yyyy";

    private DateFormat formatDay = new SimpleDateFormat(FORMAT_YMD);
    private DateFormat formatMonth = new SimpleDateFormat(FORMAT_YM);
    private DateFormat formatYear = new SimpleDateFormat(FORMAT_YEAR);



    /**
     * 将Date转String
     * @param date
     * @return
     */
    public String formatDateToString(Date date,String dateType){
        SimpleDateFormat sdf = new SimpleDateFormat(dateType);
        return sdf.format(date);
    }

    /**
     * 将String转Date
     * @param date
     * @return
     */
    public Date formatDateToDate(String date,String dateType){
        SimpleDateFormat sdf = new SimpleDateFormat(dateType);
        Date date1  = null;
        try {
            date1 =  sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date1;
    }

    /**
     * 获取上一天
     * @param format
     * @param timeStr
     * @return
     */
    public static String getBeforeOneDayStr(DateFormat format,String timeStr){
        return getBeforeNDayStr(format,timeStr,1);
    }

    /**
     * 获取上N天
     * @param format
     * @param timeStr
     * @param n
     * @return
     */
    public static String getBeforeNDayStr(DateFormat format, String timeStr,int n){
        if(!StringUtils.isEmpty(timeStr)) {
            try {
                Date dateTime = format.parse(timeStr);
                Calendar c = Calendar.getInstance();
                //过去N天
                c.setTime(dateTime);
                c.add(Calendar.DATE, -n);
                Date d = c.getTime();
                return format.format(d);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return "";
    }

    /**
     * 获取上个月
     * @param format
     * @param timeStr
     * @return
     */
    public static String getBeforeOneMonthStr(DateFormat format,String timeStr){
        return getBeforeNMonthStr(format,timeStr,1);
    }

    /**
     * 获取上年的本月
     * @param format
     * @param timeStr
     * @return
     */
    public static String getBeforeYearMonthStr(DateFormat format,String timeStr){
        return getBeforeNYearStr(format,timeStr,1);
    }

    /**
     * 获取上n个月
     * @param format
     * @param timeStr
     * @param n
     * @return
     */
    public static String getBeforeNMonthStr(DateFormat format, String timeStr,int n){
        if(!StringUtils.isEmpty(timeStr)) {
            try {
                Date dateTime = format.parse(timeStr);
                Calendar c = Calendar.getInstance();
                //过去N天
                c.setTime(dateTime);
                c.add(Calendar.MONTH, -n);
                Date d = c.getTime();
                return format.format(d);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return "";
    }

    /**
     * 获取上一年
     * @param format
     * @param timeStr
     * @return
     */
    public static String getBeforeOneYearStr(DateFormat format, String timeStr){
        return getBeforeNYearStr(format,timeStr,1);
    }

    /**
     * 获取上N年
     * @param format
     * @param timeStr
     * @param n
     * @return
     */
    public static String getBeforeNYearStr(DateFormat format, String timeStr,int n){
        if(!StringUtils.isEmpty(timeStr)) {
            try {
                Date dateTime = format.parse(timeStr);
                Calendar c = Calendar.getInstance();
                //过去N天
                c.setTime(dateTime);
                c.add(Calendar.YEAR, -n);
                Date d = c.getTime();
                return format.format(d);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return "";
    }

    public static void main(String[] args){
/*        //获取上一天
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(getBeforeOneDayStr(format,"2018-11-01"));
        //获取上一月
        format = new SimpleDateFormat("yyyy-MM");
        System.out.println(getBeforeOneMonthStr(format,"2018-11"));
        //获取上年的本月
        System.out.println(getBeforeYearMonthStr(format,"2018-11"));

        //获取上一年
        format = new SimpleDateFormat("yyyy");
        System.out.println(getBeforeOneYearStr(format,"2018"));*/


        List<String> strings = getPerDaysByStartAndEndDate("1994","2019","yyyy");
        for (String s:strings
             ) {
            System.out.println(s);
        }


    }

    /**
     * 获取区间内的所有时间 - 日
     *
     * @param startDate
     * @param endDate
     * @param dateFormat
     * @return
     */
    public static List<String> getPerDaysByStartAndEndDate(String startDate, String endDate, String dateFormat) {
        DateFormat format = new SimpleDateFormat(dateFormat);
        try {
            Date sDate = format.parse(startDate);
            Date eDate = format.parse(endDate);
            long start = sDate.getTime();
            long end = eDate.getTime();
            if (start > end) {
                return null;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(eDate);
            List<String> res = new ArrayList<String>();
            while (end >= start) {
                res.add(format.format(calendar.getTime()));
                calendar.add(Calendar.DAY_OF_MONTH, -1);
                end = calendar.getTimeInMillis();
            }
            if (FORMAT_YM.equals(dateFormat) || FORMAT_YEAR.equals(dateFormat)) {
                res = removeRepetition(res);
            }
            Collections.reverse(res);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 时间list去重复方法
     *
     * @param oldString
     * @return
     */
    public static List<String> removeRepetition(List<String> oldString) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < oldString.size(); i++) {
            if (!stringList.contains(oldString.get(i))) {
                stringList.add(oldString.get(i));
            }
        }
        return stringList;
    }
}

package com.qiankun.threeyear.core.config;

/**
 * Created by Administrator on 2017/8/28.
 */

public class Config {
    public static final boolean DEBUG = Boolean.parseBoolean("true");

//    public static String BASE_URL = "http://192.168.100.120:8080/";    //测试 地址
//    public static String IMG_BASE_URL = BASE_URL + "image";           //图片 地址
    //   public static String IMG_BASE_URL_THUM = BASE_URL + "image/thum";
    public static int DEFAULT_MILLISECONDS = 60000;             //默认的超时时间


    public static String BASE_URL = "http://116.196.95.169:8080/";    //正式 地址
    public static String IMG_BASE_URL = BASE_URL + "image";           //正式图片 地址

}

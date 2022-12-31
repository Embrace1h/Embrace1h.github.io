package com.util;

/**
 * 字符串工具类
 *
 * @author Embrace
 */
public class StringUtil {
    /**
     * 判断id或password是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        if(str == null || "".equals(str.trim())){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isNotEmpty(String str){
        if(str != null && "".equals(str.trim())){
            return true;
        }
        else{
            return false;
        }
    }
}

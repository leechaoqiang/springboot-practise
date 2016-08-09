package com.licq.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 时间工具类
 * 
 * @author lichaoqiang
 * 
 * */
public class DateFormatUtils {
	
	/**
	 * 获取当前时间，格式yyyy-MM-dd HH:mm:ss
	 * */
	public static String nowTime() {
        return DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
    }
	/**
	 * 格式化时间
	 * @param date Date时间
	 * @formatPattern String 时间格式如：yyyy-MM-dd HH:mm:ss
	 * @author lichaoqiang
	 * */
	public static String format(Date date,String formatPattern){
		if(null == date){
			return null;
		}
		if(null != formatPattern || "".equals(formatPattern)){
			formatPattern="yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(formatPattern);
		return sdf.format(date);
	}
}

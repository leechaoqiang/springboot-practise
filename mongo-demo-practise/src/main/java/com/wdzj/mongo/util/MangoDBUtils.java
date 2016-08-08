package com.wdzj.mongo.util;

import javax.sql.DataSource;

import org.jfaster.mango.datasource.DriverManagerDataSource;
import org.jfaster.mango.operator.Mango;
/**
 * 数据库连接工具类
 * @author lichaoqiang
 * 
 * */
public class MangoDBUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static Mango  getMango(){
		String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://192.168.29.1:3306/mongo_demo";
        String username = "root"; // 这里请使用您自己的用户名
        String password = "root"; // 这里请使用您自己的密码
        DataSource ds = new DriverManagerDataSource(driverClassName, url, username, password);
//        Mango mango = Mango.newInstance(ds); // 使用数据源初始化mango
		return Mango.newInstance(ds);
	}

}

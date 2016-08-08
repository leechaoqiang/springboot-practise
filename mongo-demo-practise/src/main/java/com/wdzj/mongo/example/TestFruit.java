package com.wdzj.mongo.example;

import org.jfaster.mango.operator.Mango;

import com.wdzj.mongo.dao.FruitDao;
import com.wdzj.mongo.util.MangoDBUtils;

public class TestFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数据库连接方式一
//			String driverClassName = "com.mysql.jdbc.Driver";
//	        String url = "jdbc:mysql://192.168.29.1:3306/mongo_demo";
//	        String username = "root"; // 这里请使用您自己的用户名
//	        String password = "root"; // 这里请使用您自己的密码
//	        DataSource ds = new DriverManagerDataSource(driverClassName, url, username, password);
//	        Mango mango = Mango.newInstance(ds); // 使用数据源初始化mango
	        
		//数据库连接方式二，自己封装好
		    Mango mango =MangoDBUtils.getMango();
		    
	        FruitDao dao = mango.create(FruitDao.class);
	        String name = "pear";
	        int num = 3;
	        dao.add(name, num);
	        System.out.println(dao.getTotalNum(name));
	}
	
}

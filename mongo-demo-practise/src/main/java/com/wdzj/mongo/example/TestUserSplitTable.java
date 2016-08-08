package com.wdzj.mongo.example;

import org.jfaster.mango.operator.Mango;

import com.wdzj.mongo.dao.UserDao;
import com.wdzj.mongo.util.MangoDBUtils;

/**
 * 测试分表
 * */
public class TestUserSplitTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testAddUser();
		System.out.println("add user  ended................");
		testGetUser();
	}
	
	public static void testAddUser(){
		  Mango mango =MangoDBUtils.getMango();
		  UserDao dao = mango.create(UserDao.class);
		  for(int i=0;i<10;i++){
			  
			  dao.addUser(i, "张三"+i);
		  }
	}
	public static void testGetUser(){
		  Mango mango =MangoDBUtils.getMango();
		  UserDao dao = mango.create(UserDao.class);
		  for(int i=0;i<10;i++){
			 System.out.println(dao.getUser(i));
			 
		  }
		  
	}

}

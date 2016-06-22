package com.wdzj.mongo.util;

import org.jfaster.mango.partition.DataSourceRouter;

/**
 * 分库，自定义实现数据源的获取
 * @author lichaoqiang
 * */
public class MyDataSourceRouter implements DataSourceRouter<Integer> {

	public String getDataSourceName(Integer shardParam, int type) {
		// TODO Auto-generated method stub
		 return shardParam % 4 < 2 ? "datasource1" : "datasource2";
	}

}

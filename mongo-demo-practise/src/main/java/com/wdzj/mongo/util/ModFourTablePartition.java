package com.wdzj.mongo.util;

import org.jfaster.mango.partition.TablePartition;

/**
 * 整数模4分表
 * @author lichaoqiang
 * @date 2016-06-22
 * */
public class ModFourTablePartition implements TablePartition<Integer> {

	public String getPartitionedTable(String table, Integer shardParam, int type) {
		// TODO Auto-generated method stub
		return table + "_" + (shardParam % 4);
	}

}

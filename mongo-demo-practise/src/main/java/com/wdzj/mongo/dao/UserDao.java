package com.wdzj.mongo.dao;

import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.annotation.TableShardBy;

import com.wdzj.mongo.model.User;
import com.wdzj.mongo.util.ModFourTablePartition;

@DB(table = "user", tablePartition = ModFourTablePartition.class)
public interface UserDao {
	 	@SQL("insert into #table(uid, name) values(:1, :2)")
	    public void addUser(@TableShardBy int uid, String name);

	    @SQL("select uid, name from #table where uid = :1")
	    public User getUser(@TableShardBy int uid);
}

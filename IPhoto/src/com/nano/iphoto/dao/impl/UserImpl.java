package com.nano.iphoto.dao.impl;

import java.util.List;

import com.nano.iphoto.dao.BaseDAO;
import com.nano.iphoto.dao.UserDAO;
import com.nano.iphoto.entity.User;

public class UserImpl extends BaseDAO implements UserDAO{

	@Override
	public User selectUserByName(String userName, String pwd) {
		StringBuilder sqlBuilder=new StringBuilder();
		sqlBuilder.append("select * from user where userName = ? ")
				  .append(" and pwd = ?");
		query(sqlBuilder.toString(), new String[]{userName,pwd});
		
		
		
		
		closeAll();
		return null;
	}

	@Override
	public User selectUserByID(int ID) {
		return null;
	}

	@Override
	public List<User> selectAll() {
		return null;
	}

	@Override
	public int addUser(User newUser) {
		return 0;
	}

	@Override
	public int modifyUserStateByID(int ID, int oldID, int newID) {
		return 0;
	}

	@Override
	public int riseIntegralByID(int ID, int integral) {
		return 0;
	}

}

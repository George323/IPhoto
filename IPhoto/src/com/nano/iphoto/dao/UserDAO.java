package com.nano.iphoto.dao;

import java.util.List;

import com.nano.iphoto.entity.User;

public interface UserDAO {
	
	/**
	 * 根据用户名和密码查询用户信息
	 * @param userName
	 * @param password
	 * @return
	 */
	User selectUserByName(String userName,String password);
	
	/**
	 * 根据用户ID查询用户信息
	 * @param ID
	 * @return
	 */
	User selectUserByID(int ID);
	
	
	/**
	 * 查询全部用户信息
	 * @return
	 */
	List<User> selectAll();
	
	
	/**
	 * 添加新用户
	 * @param user
	 */
	int addUser(User newUser);
	
	/**
	 * 修改用户状态
	 * @param ID
	 * @param oldID
	 * @param newID
	 * @return
	 */
	int modifyUserStateByID(int ID,int oldID,int newID);
	
	/**
	 * 增加积分
	 * @param ID
	 * @param integral
	 * @return
	 */
	int riseIntegralByID(int ID,int integral); 
	
}

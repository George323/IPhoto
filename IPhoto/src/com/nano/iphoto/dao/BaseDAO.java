package com.nano.iphoto.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.activation.FileDataSource;

import com.nano.iphoto.entity.User;

public class BaseDAO {

	protected String DRIVER = null;
	protected String URL = null;
	protected String USER = null;
	protected String PASSWORD = null;

	protected ResultSet rs = null;
	protected Connection conn = null;
	protected Statement stmt = null;

	public BaseDAO() {

		String configFilePath = System.getProperty("user.dir") + File.separator
				+ "config" + File.separator + "config.properties";
		File configFile = new File(configFilePath);
		Properties configPro = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(configFile);
			configPro.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		DRIVER = configPro.getProperty("DRIVER");
		URL = configPro.getProperty("URL");
		USER = configPro.getProperty("USER");
		PASSWORD = configPro.getProperty("PASSWORD");
	}

	public void createConn() {
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeAll() {

		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				rs = null;
			}

		}

		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				stmt = null;
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				conn=null;
			}
		}

	}

	public void query(String sql, String[] params) {
		createConn();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; params != null && i < params.length; i++) {
				pstmt.setString(i + 1, params[i]);
			}
			rs = pstmt.executeQuery();
			stmt=pstmt;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int update(String sql, String[] params) {
		createConn();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; params != null && i < params.length; i++) {
				pstmt.setString(i + 1, params[i]);
			}
			return pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return -1;
	}


	public int getMaxId(String tabName, String idColName) {
		String sql = "select max(" + idColName + ") from " + tabName;
		try {
			query(sql, null);
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return -1;
	}

	public int getMaxId(String tabName, String idColName, int limit) {
		String sql = "select max(" + idColName + ") from " + tabName
				+ " where secondId=" + limit + " and state > 0";
		try {
			query(sql, null);
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return -1;
	}
	
	/**
	 * 从Result和Statement中解析出一个对象
	 * @param <T>
	 * @return
	 */
	public Object parseAnObject(Class clz){
		try {
			Object object=clz.newInstance();
			Field field=object.getClass().getDeclaredField("name");
			System.out.println(field.getModifiers());
			field.setAccessible(true);
			field.set(object, "ssss");
			System.out.println(object);
			System.out.println(field);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return null;
	}
	
	public static void main(String[] args) {
		new BaseDAO().parseAnObject(User.class);
	}

}

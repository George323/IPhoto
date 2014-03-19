package com.nano.iphoto.dao;

import java.util.List;

import com.nano.iphoto.entity.Album;

public interface AlbumDAO {
	
	/**
	 * 根据相册ID查询相册
	 * @param albumID
	 */
	Album selectAlbumByAlbumID(int albumID);
	
	/**
	 * 根据相册类型查询相册
	 * @param type
	 */
	List<Album> selectAlbumByType(int type);
	
	/**
	 * 根据用户ID查询相册
	 * @param userID
	 */
	List<Album> selectAlbumByTypeUserID(int userID);
	
	/**
	 * 查询全部相册信息
	 * @return
	 */
	List<Album> selectAll();
	
	/**
	 * 	添加新相册
	 * @param album
	 */
	int addAlbum(Album album);
	
	/**
	 * 修改相册状态
	 * @param albumID
	 * @param oldID
	 * @param newID
	 * @return
	 */
	int modifyAlbumStateByID(int albumID,int oldID,int newID);
	
}

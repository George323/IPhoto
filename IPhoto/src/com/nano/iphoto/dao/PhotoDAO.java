package com.nano.iphoto.dao;

import java.util.List;

import com.nano.iphoto.entity.Photo;

public interface PhotoDAO {
	
	/**
	 * 根据photoID查询照片信息
	 * @param photoID
	 * @return
	 */
	Photo selectPhotoByPhotoID(int photoID);
	
	/**
	 * 根据albumID查询照片信息
	 * @param albumID
	 * @return
	 */
	List<Photo> selectPhotoByAlbumID(int albumID);
	
	/**
	 * 查询全部照片
	 * @return
	 */
	List<Photo> selectAll();
	
	/**
	 * 添加新的照片
	 * @param Photo
	 * @return
	 */
	int addPhoto(Photo photo);
	
	/**
	 * 根据照片状态查询照片
	 * @param state
	 * 
	 */
	List<Photo> selectPhotoByState(int state);
	
	/**
	 * 根据照片ID修改照片状态
	 * @param photoID
	 * @param oldID
	 * @param newID
	 */
	int modifyPhotoStateByID(int photoID,int oldID,int newID);
}

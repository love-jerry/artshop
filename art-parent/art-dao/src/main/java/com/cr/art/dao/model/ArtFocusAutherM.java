package com.cr.art.dao.model;

import java.util.Date;

public class ArtFocusAutherM {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column art_user_focus_author.id
	 * @mbggenerated
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column art_user_focus_author.user_id
	 * @mbggenerated
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column art_user_focus_author.focused_user_id
	 * @mbggenerated
	 */
	private String focusedUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column art_user_focus_author.focus_time
	 * @mbggenerated
	 */
	private Date focusTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column art_user_focus_author.insert_time
	 * @mbggenerated
	 */
	private Date insertTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column art_user_focus_author.update_time
	 * @mbggenerated
	 */
	private Date updateTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column art_user_focus_author.id
	 * @return  the value of art_user_focus_author.id
	 * @mbggenerated
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column art_user_focus_author.id
	 * @param id  the value for art_user_focus_author.id
	 * @mbggenerated
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column art_user_focus_author.user_id
	 * @return  the value of art_user_focus_author.user_id
	 * @mbggenerated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column art_user_focus_author.user_id
	 * @param userId  the value for art_user_focus_author.user_id
	 * @mbggenerated
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column art_user_focus_author.focused_user_id
	 * @return  the value of art_user_focus_author.focused_user_id
	 * @mbggenerated
	 */
	public String getFocusedUserId() {
		return focusedUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column art_user_focus_author.focused_user_id
	 * @param focusedUserId  the value for art_user_focus_author.focused_user_id
	 * @mbggenerated
	 */
	public void setFocusedUserId(String focusedUserId) {
		this.focusedUserId = focusedUserId == null ? null : focusedUserId
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column art_user_focus_author.focus_time
	 * @return  the value of art_user_focus_author.focus_time
	 * @mbggenerated
	 */
	public Date getFocusTime() {
		return focusTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column art_user_focus_author.focus_time
	 * @param focusTime  the value for art_user_focus_author.focus_time
	 * @mbggenerated
	 */
	public void setFocusTime(Date focusTime) {
		this.focusTime = focusTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column art_user_focus_author.insert_time
	 * @return  the value of art_user_focus_author.insert_time
	 * @mbggenerated
	 */
	public Date getInsertTime() {
		return insertTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column art_user_focus_author.insert_time
	 * @param insertTime  the value for art_user_focus_author.insert_time
	 * @mbggenerated
	 */
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column art_user_focus_author.update_time
	 * @return  the value of art_user_focus_author.update_time
	 * @mbggenerated
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column art_user_focus_author.update_time
	 * @param updateTime  the value for art_user_focus_author.update_time
	 * @mbggenerated
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
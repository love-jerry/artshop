package com.cr.art.dao.model;

import java.util.Date;

public class ArtJobFieldM {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column art_job_field.field_id
	 * @mbggenerated
	 */
	private String fieldId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column art_job_field.user_id
	 * @mbggenerated
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column art_job_field.field_name
	 * @mbggenerated
	 */
	private String fieldName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column art_job_field.add_time
	 * @mbggenerated
	 */
	private Date addTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column art_job_field.update_time
	 * @mbggenerated
	 */
	private Date updateTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column art_job_field.field_id
	 * @return  the value of art_job_field.field_id
	 * @mbggenerated
	 */
	public String getFieldId() {
		return fieldId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column art_job_field.field_id
	 * @param fieldId  the value for art_job_field.field_id
	 * @mbggenerated
	 */
	public void setFieldId(String fieldId) {
		this.fieldId = fieldId == null ? null : fieldId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column art_job_field.user_id
	 * @return  the value of art_job_field.user_id
	 * @mbggenerated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column art_job_field.user_id
	 * @param userId  the value for art_job_field.user_id
	 * @mbggenerated
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column art_job_field.field_name
	 * @return  the value of art_job_field.field_name
	 * @mbggenerated
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column art_job_field.field_name
	 * @param fieldName  the value for art_job_field.field_name
	 * @mbggenerated
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName == null ? null : fieldName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column art_job_field.add_time
	 * @return  the value of art_job_field.add_time
	 * @mbggenerated
	 */
	public Date getAddTime() {
		return addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column art_job_field.add_time
	 * @param addTime  the value for art_job_field.add_time
	 * @mbggenerated
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column art_job_field.update_time
	 * @return  the value of art_job_field.update_time
	 * @mbggenerated
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column art_job_field.update_time
	 * @param updateTime  the value for art_job_field.update_time
	 * @mbggenerated
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
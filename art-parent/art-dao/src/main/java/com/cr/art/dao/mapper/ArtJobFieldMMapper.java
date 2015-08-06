package com.cr.art.dao.mapper;

import com.cr.art.dao.model.ArtJobFieldM;
import com.cr.art.dao.model.ArtJobFieldMExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtJobFieldMMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_job_field
	 * @mbggenerated
	 */
	int countByExample(ArtJobFieldMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_job_field
	 * @mbggenerated
	 */
	int deleteByExample(ArtJobFieldMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_job_field
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String fieldId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_job_field
	 * @mbggenerated
	 */
	int insert(ArtJobFieldM record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_job_field
	 * @mbggenerated
	 */
	int insertSelective(ArtJobFieldM record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_job_field
	 * @mbggenerated
	 */
	List<ArtJobFieldM> selectByExample(ArtJobFieldMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_job_field
	 * @mbggenerated
	 */
	ArtJobFieldM selectByPrimaryKey(String fieldId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_job_field
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") ArtJobFieldM record,
			@Param("example") ArtJobFieldMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_job_field
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") ArtJobFieldM record,
			@Param("example") ArtJobFieldMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_job_field
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(ArtJobFieldM record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_job_field
	 * @mbggenerated
	 */
	int updateByPrimaryKey(ArtJobFieldM record);
}
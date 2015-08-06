package com.cr.art.dao.mapper;

import com.cr.art.dao.model.ArtFocusAutherM;
import com.cr.art.dao.model.ArtFocusAutherMExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtFocusAutherMMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_focus_author
	 * @mbggenerated
	 */
	int countByExample(ArtFocusAutherMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_focus_author
	 * @mbggenerated
	 */
	int deleteByExample(ArtFocusAutherMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_focus_author
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_focus_author
	 * @mbggenerated
	 */
	int insert(ArtFocusAutherM record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_focus_author
	 * @mbggenerated
	 */
	int insertSelective(ArtFocusAutherM record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_focus_author
	 * @mbggenerated
	 */
	List<ArtFocusAutherM> selectByExample(ArtFocusAutherMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_focus_author
	 * @mbggenerated
	 */
	ArtFocusAutherM selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_focus_author
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") ArtFocusAutherM record,
			@Param("example") ArtFocusAutherMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_focus_author
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") ArtFocusAutherM record,
			@Param("example") ArtFocusAutherMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_focus_author
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(ArtFocusAutherM record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_focus_author
	 * @mbggenerated
	 */
	int updateByPrimaryKey(ArtFocusAutherM record);
}
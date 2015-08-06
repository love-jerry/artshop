package com.cr.art.dao.mapper;

import com.cr.art.dao.model.ArtPraiseArtM;
import com.cr.art.dao.model.ArtPraiseArtMExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtPraiseArtMMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_praise_art
	 * @mbggenerated
	 */
	int countByExample(ArtPraiseArtMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_praise_art
	 * @mbggenerated
	 */
	int deleteByExample(ArtPraiseArtMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_praise_art
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String praiseId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_praise_art
	 * @mbggenerated
	 */
	int insert(ArtPraiseArtM record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_praise_art
	 * @mbggenerated
	 */
	int insertSelective(ArtPraiseArtM record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_praise_art
	 * @mbggenerated
	 */
	List<ArtPraiseArtM> selectByExample(ArtPraiseArtMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_praise_art
	 * @mbggenerated
	 */
	ArtPraiseArtM selectByPrimaryKey(String praiseId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_praise_art
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") ArtPraiseArtM record,
			@Param("example") ArtPraiseArtMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_praise_art
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") ArtPraiseArtM record,
			@Param("example") ArtPraiseArtMExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_praise_art
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(ArtPraiseArtM record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table art_user_praise_art
	 * @mbggenerated
	 */
	int updateByPrimaryKey(ArtPraiseArtM record);
}
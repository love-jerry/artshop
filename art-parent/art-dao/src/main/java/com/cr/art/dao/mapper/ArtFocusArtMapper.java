package com.cr.art.dao.mapper;

import com.cr.art.dao.model.ArtFocusArt;
import com.cr.art.dao.model.ArtFocusArtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtFocusArtMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_focus_art
     *
     * @mbggenerated
     */
    int countByExample(ArtFocusArtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_focus_art
     *
     * @mbggenerated
     */
    int deleteByExample(ArtFocusArtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_focus_art
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_focus_art
     *
     * @mbggenerated
     */
    int insert(ArtFocusArt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_focus_art
     *
     * @mbggenerated
     */
    int insertSelective(ArtFocusArt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_focus_art
     *
     * @mbggenerated
     */
    List<ArtFocusArt> selectByExample(ArtFocusArtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_focus_art
     *
     * @mbggenerated
     */
    ArtFocusArt selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_focus_art
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ArtFocusArt record, @Param("example") ArtFocusArtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_focus_art
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ArtFocusArt record, @Param("example") ArtFocusArtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_focus_art
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ArtFocusArt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_focus_art
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ArtFocusArt record);
}
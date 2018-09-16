package com.tiantianmeitu.background.mapper;

import com.tiantianmeitu.background.bean.Catalog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CatalogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer catalogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated
     */
    int insert(Catalog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated
     */
    Catalog selectByPrimaryKey(Integer catalogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated
     */
    List<Catalog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catalog
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Catalog record);
}
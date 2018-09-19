package com.tiantianmeitu.background.mapper.post;

import com.tiantianmeitu.background.bean.post.Catalog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CatalogMapper {
    int deleteByPrimaryKey(Integer catalogId);

    int insert(Catalog record);

    Catalog selectByPrimaryKey(Integer catalogId);

    List<Catalog> selectAll();

    int updateByPrimaryKey(Catalog record);
}
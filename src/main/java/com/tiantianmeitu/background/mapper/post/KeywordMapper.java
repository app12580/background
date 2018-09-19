package com.tiantianmeitu.background.mapper.post;

import com.tiantianmeitu.background.bean.post.Keyword;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KeywordMapper {
    int deleteByPrimaryKey(Integer keywordId);

    int insert(Keyword record);

    Keyword selectByPrimaryKey(Integer keywordId);

    List<Keyword> selectAll();

    int updateByPrimaryKey(Keyword record);
}
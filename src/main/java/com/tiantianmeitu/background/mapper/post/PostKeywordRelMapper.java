package com.tiantianmeitu.background.mapper.post;

import com.tiantianmeitu.background.bean.post.PostKeywordRel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostKeywordRelMapper {
    int deleteByPrimaryKey(Integer postKeywordRelId);

    int insert(PostKeywordRel record);

    PostKeywordRel selectByPrimaryKey(Integer postKeywordRelId);

    List<PostKeywordRel> selectAll();

    int updateByPrimaryKey(PostKeywordRel record);
}
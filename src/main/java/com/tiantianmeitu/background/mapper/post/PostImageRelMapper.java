package com.tiantianmeitu.background.mapper.post;

import com.tiantianmeitu.background.bean.post.PostImageRel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostImageRelMapper {
    int deleteByPrimaryKey(Integer postImageRelId);

    int insert(PostImageRel record);

    PostImageRel selectByPrimaryKey(Integer postImageRelId);

    List<PostImageRel> selectAll();

    int updateByPrimaryKey(PostImageRel record);
}
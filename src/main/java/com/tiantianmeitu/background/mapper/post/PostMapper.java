package com.tiantianmeitu.background.mapper.post;

import com.tiantianmeitu.background.bean.post.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    int deleteByPrimaryKey(Integer postId);

    int insert(Post record);

    Post selectByPrimaryKey(Integer postId);

    List<Post> selectAll();

    int updateByPrimaryKey(Post record);
}
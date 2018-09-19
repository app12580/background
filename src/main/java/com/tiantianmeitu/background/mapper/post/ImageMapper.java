package com.tiantianmeitu.background.mapper.post;

import com.tiantianmeitu.background.bean.post.Image;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ImageMapper {
    int deleteByPrimaryKey(Integer imageId);

    int insert(Image record);

    Image selectByPrimaryKey(Integer imageId);

    List<Image> selectAll();

    int updateByPrimaryKey(Image record);

    List<Image> getImageByPostId(Integer postId);
}
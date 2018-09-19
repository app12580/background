package com.tiantianmeitu.background.service.post;

import com.tiantianmeitu.background.bean.post.Image;
import com.tiantianmeitu.background.mapper.post.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

    @Autowired
    private ImageMapper imageMapper;

    public List<Image> getImageByPostId(Integer postId) {
        return imageMapper.getImageByPostId(postId);
    }

}

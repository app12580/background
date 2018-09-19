package com.tiantianmeitu.background.controller;

import com.tiantianmeitu.background.bean.post.Image;
import com.tiantianmeitu.background.bean.post.Keyword;
import com.tiantianmeitu.background.service.post.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private ImageService imageService;

    @RequestMapping("/view/{postId}")
    public List<Image> getAll(@PathVariable("postId") Integer postId ){
        return imageService.getImageByPostId(postId);
    }
}

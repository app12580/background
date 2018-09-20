package com.tiantianmeitu.background.service.post;

import com.tiantianmeitu.background.bean.post.Post;
import com.tiantianmeitu.background.mapper.post.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostMapper postMapper;

    public List<Post> getPostsByCatalogId(Integer catalogId) {
        return postMapper.getPostsByCatalogId(catalogId);
    }

    public Post selectPostInfoById(Integer postId) {
        return postMapper.selectPostInfoById(postId);
    }
}

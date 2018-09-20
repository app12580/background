package com.tiantianmeitu.background.controller;

import com.tiantianmeitu.background.bean.post.Catalog;
import com.tiantianmeitu.background.bean.post.Image;
import com.tiantianmeitu.background.bean.post.Keyword;
import com.tiantianmeitu.background.bean.post.Post;
import com.tiantianmeitu.background.service.post.CatalogService;
import com.tiantianmeitu.background.service.post.ImageService;
import com.tiantianmeitu.background.service.post.PostService;
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
    @Autowired
    private CatalogService catalogService;
    @Autowired
    private PostService postService;

    @RequestMapping("/post-{postId}/images")
    public List<Image> getImageByPostId(@PathVariable("postId") Integer postId) {
        return imageService.getImageByPostId(postId);
    }

    @RequestMapping("/catalogs")
    public List<Catalog> getFirstCatalogListWithChild() {
        return catalogService.getFirstCatalogListWithChild();
    }

    @RequestMapping("/catalog-{catalogId}/catalogs")
    public List<Catalog> getChildrenCatalogs(@PathVariable("catalogId") Integer catalogId) {
        return catalogService.getChildrenCatalogs(catalogId);
    }

    @RequestMapping("/catalog-{catalogId}/posts")
    public List<Post> getPostsByCatalogId(@PathVariable("catalogId") Integer catalogId) {
        return postService.getPostsByCatalogId(catalogId);
    }

    @RequestMapping("/post-{postId}/info")
    public Post getPostInfoById(@PathVariable("postId") Integer postId) {
        return postService.selectPostInfoById(postId);
    }


    @RequestMapping("/test/1")
    public List<Catalog> test1() {
        return catalogService.getFirstCatalogList();
    }

    @RequestMapping("/test/2")
    public List<Catalog> test2() {
        int c = 11232;
        System.out.println(c);
        return catalogService.getFirstCatalogListWithChild();
    }


}




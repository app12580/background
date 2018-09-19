package com.tiantianmeitu.background.controller;

import com.tiantianmeitu.background.bean.post.Keyword;
import com.tiantianmeitu.background.mapper.post.KeywordMapper;
import com.tiantianmeitu.background.service.post.KeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/keyword")
public class KeywordController {

    @Autowired
    private KeywordMapper keywordMapper;
    @Autowired
    private KeywordService keywordService;

    @RequestMapping("/getAll")
    public List<Keyword> getAll(){
        List<Keyword> list = keywordMapper.selectAll();
        return list;
    }

    @RequestMapping("/getAll2")
    public List<Keyword> getAll2(){
        List<Keyword> list = keywordService.selectAll();
        return list;
    }

}

package com.tiantianmeitu.background.controller;

import com.tiantianmeitu.background.bean.Keyword;
import com.tiantianmeitu.background.mapper.KeywordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/keyword")
public class KeywordController {

    @Autowired
    private KeywordMapper keywordMapper;

    @RequestMapping("/getAll")
    public List<Keyword> getAll(){
        List<Keyword> list = keywordMapper.selectAll();
        return list;
    }


}

package com.tiantianmeitu.background.service.post;

import com.tiantianmeitu.background.bean.post.Keyword;
import com.tiantianmeitu.background.mapper.post.KeywordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeywordService {
    @Autowired
    private KeywordMapper keywordMapper;

    public List<Keyword> selectAll() {
        return keywordMapper.selectAll();
    }
}

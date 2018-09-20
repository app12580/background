package com.tiantianmeitu.background.service.post;

import com.tiantianmeitu.background.bean.post.Catalog;
import com.tiantianmeitu.background.mapper.post.CatalogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    private CatalogMapper catalogMapper;

    public List<Catalog> getFirstCatalogList() {
        return catalogMapper.getFirstCatalogList();
    }

    public List<Catalog> getFirstCatalogListWithChild() {
        return catalogMapper.getFirstCatalogListWithChild();
    }

    public List<Catalog> getChildrenCatalogs(Integer catalogId) {
        return catalogMapper.getChildrenCatalogs(catalogId);
    }

}

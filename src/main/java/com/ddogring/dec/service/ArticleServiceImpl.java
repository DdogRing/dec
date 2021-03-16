package com.ddogring.dec.service;

import com.ddogring.dec.entity.Article;
import com.ddogring.dec.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DdogRing
 * @date 2021/3/16 13:48
 * @description
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public int remove(Integer id) {
        return 0;
    }

    @Override
    public int add(Article article) {
        return articleMapper.insertSelective(article);
    }

    @Override
    public Article get(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int modify(Article article) {
        return articleMapper.updateByPrimaryKeySelective(article);
    }

    @Override
    public List<Article> articleList() {
        return articleMapper.articleList();
    }

    @Override
    public List<Article> getArticleListById(Integer id) {
        return articleMapper.articleListById(id);
    }
}
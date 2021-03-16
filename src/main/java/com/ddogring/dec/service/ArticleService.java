package com.ddogring.dec.service;

import com.ddogring.dec.entity.Article;

import java.util.List;

/**
 * @author DdogRing
 * @date 2021/3/16 13:46
 * @description 文章业务
 */
public interface ArticleService {

    int remove(Integer id);

    int add(Article article);

    Article get(Integer id);

    int modify(Article record);

    List<Article> articleList();

    List<Article> getArticleListById(Integer id);

}

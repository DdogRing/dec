package com.ddogring.dec.controller;

import com.ddogring.dec.constant.Constant;
import com.ddogring.dec.entity.Article;
import com.ddogring.dec.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author DdogRing
 * @date 2021/3/16 09:40
 * @description 文章接口
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/articleList")
    public String articleList() {

        articleService.articleList();
        return "article";
    }

    @RequestMapping("/articleListById")
    public String getArticleById(Integer id, Model model) {

        List<Article> articleList = articleService.getArticleListById(id);
        model.addAttribute(Constant.ARTICLE_LIST, articleList);
        return "article";
    }
}

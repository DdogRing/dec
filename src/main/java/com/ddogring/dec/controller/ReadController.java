package com.ddogring.dec.controller;

import com.ddogring.dec.constant.Constant;
import com.ddogring.dec.entity.Article;
import com.ddogring.dec.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DdogRing
 * @date 2021/3/16 09:59
 * @description 文章内容接口
 */
@Controller
public class ReadController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/read")
    public String read(Integer id, Model model) {
        Article article = articleService.get(id);
        model.addAttribute(Constant.ARTICLE_INFO, article);
        return "read";
    }
}

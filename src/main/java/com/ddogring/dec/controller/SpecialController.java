package com.ddogring.dec.controller;

import com.ddogring.dec.constant.Constant;
import com.ddogring.dec.entity.SpecialColumn;
import com.ddogring.dec.service.SpecialColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author DdogRing
 * @date 2021/3/16 09:09
 * @description 专题接口
 */
@Controller
public class SpecialController {

    @Autowired
    private SpecialColumnService specialColumnService;

    @RequestMapping("/specialList")
    public String articleList(Model model) {
        List<SpecialColumn> specialColumns = specialColumnService.specialColumnList();
        model.addAttribute(Constant.SPECIAL_LIST, specialColumns);
        return "special";
    }
}

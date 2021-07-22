package org.kinosearch.controller;

import org.kinosearch.dto.ArticleDesignDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
public class ArticleDesignController {

    @GetMapping
    public String getTemp(Model model) {
        model.addAttribute("resultDTO", new ArticleDesignDTO());
        return "article/one";
    }

    @PostMapping("/create")
    public String create(@RequestBody String json) {
        return "article/one";
    }

}

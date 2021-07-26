package org.kinosearch.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.kinosearch.dto.ArticleDesignDTO;
import org.kinosearch.dto.BlockDTO;
import org.kinosearch.services.ArticleDesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Type;
import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleDesignController {

    @Autowired
    private ArticleDesignService articleDesignService;
    @GetMapping
    public String getTemp(Model model) {
        model.addAttribute("resultDTO", new ArticleDesignDTO());
        return "article/one";
    }

    @PostMapping("/create")
    public String create(@RequestBody String json) throws JsonProcessingException {
        Gson gson = new Gson();
        Type type = new TypeToken<List<BlockDTO>>(){}.getType();
        List<BlockDTO> blockDTOS = gson.fromJson(json, type);
        articleDesignService.save(blockDTOS);
        return "article/one";
    }

}

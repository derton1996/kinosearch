package org.kinosearch.services;


import org.kinosearch.dto.ArticleDesignDTO;
import org.kinosearch.dto.BlockDTO;
import org.kinosearch.repository.ArticleDesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleDesignService{
    private final ArticleDesignRepository articleDesignRepository;

    @Autowired
    public ArticleDesignService(ArticleDesignRepository articleDesignRepository){this.articleDesignRepository=articleDesignRepository;}

    public void save(List<BlockDTO> blockDTOS){
        ArticleDesignDTO articleDesignDTO = new ArticleDesignDTO();
        articleDesignDTO.setBlocks(blockDTOS);
        articleDesignRepository.save(articleDesignDTO);
    }
}

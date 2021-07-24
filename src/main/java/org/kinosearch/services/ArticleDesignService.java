package org.kinosearch.services;


import org.kinosearch.dto.ArticleDesignDTO;
import org.kinosearch.dto.BlockDTO;
import org.kinosearch.repository.ArticleDesignRepository;
import org.kinosearch.repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleDesignService{
    private final ArticleDesignRepository articleDesignRepository;
    private final BlockRepository blockRepository;

    @Autowired
    public ArticleDesignService(ArticleDesignRepository articleDesignRepository, BlockRepository blockRepository)
    {
        this.articleDesignRepository=articleDesignRepository;
        this.blockRepository = blockRepository;
    }

    public void save(List<BlockDTO> blockDTOS){
        ArticleDesignDTO articleDesignDTO = new ArticleDesignDTO();
        articleDesignDTO.setBlocks(blockDTOS);

        //blockDTOS.forEach(blockDTO -> blockDTO.setArticleDesignDTO(articleDesignDTO));
        articleDesignRepository.save(articleDesignDTO);
        //blockRepository.saveAll(blockDTOS);

    }
}

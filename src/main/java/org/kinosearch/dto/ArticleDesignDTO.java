package org.kinosearch.dto;

import java.util.List;

public class ArticleDesignDTO {

    List<ArticleDesignDTO> blocks;

    public ArticleDesignDTO() {
    }

    public ArticleDesignDTO(List<ArticleDesignDTO> blocks) {
        this.blocks = blocks;
    }

    public List<ArticleDesignDTO> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<ArticleDesignDTO> blocks) {
        this.blocks = blocks;
    }
}

package org.kinosearch.dto;


import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="article_design")
public class ArticleDesignDTO {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BlockDTO> blocks;

    public ArticleDesignDTO() {
    }

    public ArticleDesignDTO(List<BlockDTO> blocks) {
        this.blocks = blocks;
    }

    public List<BlockDTO> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<BlockDTO> blocks) {
        blocks.forEach(blockDTO -> blockDTO.setArticleDesignDTO(this));
        this.blocks = blocks;
    }
}

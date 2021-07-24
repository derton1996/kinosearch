package org.kinosearch.dto;


import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="articledesign")
public class ArticleDesignDTO {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "blocks")
    @OneToMany
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
        this.blocks = blocks;
    }
}

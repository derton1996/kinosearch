package org.kinosearch.dto;



import javax.persistence.*;

@Entity
@Table(name="block")
public class BlockDTO {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "clazz")
    private String clazz;
    @Column(name = "content")
    private String content;

    @ManyToOne( cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "article_design_id")
    private ArticleDesignDTO articleDesignDTO;

    public BlockDTO() {
    }

    public BlockDTO(String clazz, String content) {
        this.clazz = clazz;
        this.content = content;
    }

    public void setArticleDesignDTO(ArticleDesignDTO articleDesignDTO) {
        this.articleDesignDTO = articleDesignDTO;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

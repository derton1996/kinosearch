package org.kinosearch.dto;



import javax.persistence.*;

@Entity
@Table(name="block")
public class BlockDTO {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "clazz")
    private String clazz;
    @Column(name = "content")
    private String content;

    public BlockDTO() {
    }

    public BlockDTO(String clazz, String content) {
        this.clazz = clazz;
        this.content = content;
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

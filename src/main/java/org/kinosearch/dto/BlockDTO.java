package org.kinosearch.dto;

public class BlockDTO {

    private String clazz;
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

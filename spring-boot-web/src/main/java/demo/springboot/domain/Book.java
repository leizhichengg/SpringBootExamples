package demo.springboot.domain;

import java.io.Serializable;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/24 0024 19:32
 */
public class Book implements Serializable {

    private Long id;

    private String name;

    private String writer;

    private String introduction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}

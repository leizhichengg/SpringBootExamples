package demo.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/24 0024 19:18
 */

@Component
public class BookProperties {

    @Value("${demo.book.name}")
    private String name;

    @Value("${demo.book.writer}")
    private String writer;

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
}

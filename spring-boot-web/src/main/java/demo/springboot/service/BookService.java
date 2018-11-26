package demo.springboot.service;

import demo.springboot.domain.Book;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/24 0024 19:34
 */
public interface BookService {

    List<Book> findAll();

    Book insertByBook(Book book);

    Book update(Book book);

    Book delete(Long id);

    Book findById(Long id);
}

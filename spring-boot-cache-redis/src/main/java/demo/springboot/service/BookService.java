package demo.springboot.service;

import demo.springboot.domain.Book;

import java.util.List;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/25 0025 16:29
 */
public interface BookService {
    List<Book> findAll();

    Book insertByBook(Book book);

    Book update(Book book);

    Book delete(Long id);

    Book findById(Long id);
}

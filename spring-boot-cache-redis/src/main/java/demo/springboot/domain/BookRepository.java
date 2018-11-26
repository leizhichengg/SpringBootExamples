package demo.springboot.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/25 0025 16:29
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}

package spring.boot.core.service;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/25 0025 0:25
 */

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import spring.boot.core.domain.User;

public interface UserService {

    Page<User> findByPage(Pageable pageable);

    User insertByUser(User user);
}

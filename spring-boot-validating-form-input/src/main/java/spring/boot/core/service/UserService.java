package spring.boot.core.service;

import spring.boot.core.domain.User;

import java.util.List;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/24 0024 20:07
 */
public interface UserService {

    List<User> findAll();

    User insertByUser(User uSer);

    User update(User user);

    User delete(Long id);

    User findById(Long id);

}

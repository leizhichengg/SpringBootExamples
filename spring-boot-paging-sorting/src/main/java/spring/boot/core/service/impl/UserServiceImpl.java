package spring.boot.core.service.impl;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/25 0025 0:25
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import spring.boot.core.domain.User;
import spring.boot.core.domain.UserRepository;
import spring.boot.core.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public Page<User> findByPage(Pageable pageable) {
        LOGGER.info(" \n 分页查询用户："
                + " PageNumber = " + pageable.getPageNumber()
                + " PageSize = " + pageable.getPageSize());
        return userRepository.findAll(pageable);
    }

    @Override
    public User insertByUser(User user) {
        LOGGER.info("新增用户：" + user.toString());
        return userRepository.save(user);
    }
}

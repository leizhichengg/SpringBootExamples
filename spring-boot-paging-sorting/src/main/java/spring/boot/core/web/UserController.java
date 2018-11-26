package spring.boot.core.web;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/25 0025 0:26
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.core.domain.User;
import spring.boot.core.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public Page<User> getUserPage(Pageable pageable) {
        return userService.findByPage(pageable);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User postUser(@RequestBody User user) {
        return userService.insertByUser(user);
    }

}

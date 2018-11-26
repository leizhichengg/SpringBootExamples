package demo.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/24 0024 19:04
 */

@RestController
public class HelloBookController {

    @RequestMapping(value = "/book/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello, 《Spring Boot》!";
    }
}

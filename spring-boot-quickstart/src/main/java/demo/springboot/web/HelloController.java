package demo.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/24 0024 19:06
 */

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}

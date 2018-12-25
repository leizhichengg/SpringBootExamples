package com.springboot.web;

import com.springboot.domain.Person;
import com.springboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/12/25 0025 17:14
 */
@RestController
public class MyController {

    @Autowired
    DemoService demoService;

    @RequestMapping("/rollback")
    public Person rollback(Person person) {

        return demoService.savePersonWithRollBack(person);
    }

    @RequestMapping("/norollback")
    public Person norollback(Person person) {

        return demoService.savePersonWithoutRollBack(person);
    }

}

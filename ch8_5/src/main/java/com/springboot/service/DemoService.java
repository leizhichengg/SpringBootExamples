package com.springboot.service;

import com.springboot.domain.Person;
import org.springframework.stereotype.Service;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/12/26 0026 15:52
 */
public interface DemoService {

    public Person save(Person person);

    public void remove(Long id);

    public Person findOne(Person person);
}

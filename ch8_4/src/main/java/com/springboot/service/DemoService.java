package com.springboot.service;

import com.springboot.domain.Person;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/12/25 0025 17:05
 */
public interface DemoService {

    public Person savePersonWithRollBack(Person person);

    public Person savePersonWithoutRollBack(Person person);

}

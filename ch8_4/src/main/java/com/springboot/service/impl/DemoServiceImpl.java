package com.springboot.service.impl;

import com.springboot.dao.PersonRepository;
import com.springboot.domain.Person;
import com.springboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/12/25 0025 17:07
 */

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    PersonRepository personRepository;

    @Override
    @Transactional(rollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithRollBack(Person person) {
        Person p = personRepository.save(person);

        if (person.getName().equals("lzc")) {
            throw new IllegalArgumentException("lzc is existed, data will roll back");
        }

        return p;
    }

    @Override
    @Transactional(noRollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithoutRollBack(Person person) {
        Person p = personRepository.save(person);

        if (person.getName().equals("lzc")) {
            throw new IllegalArgumentException("lzc is existed, but data will not roll back");
        }

        return p;
    }

}

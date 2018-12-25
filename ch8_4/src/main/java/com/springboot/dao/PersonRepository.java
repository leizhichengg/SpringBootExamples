package com.springboot.dao;

import com.springboot.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/12/25 0025 17:05
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}

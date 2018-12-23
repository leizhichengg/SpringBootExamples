package com.springboot.dao;

import com.springboot.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/12/22 0022 16:16
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByAddress(String name);

    Person findByNameAndAddress(String name, String address);

    @Query("select p from Person p where p.name = :name and p.address = :address")
    Person withNameAndAddressQurey(@Param("name") String name,
                                   @Param("address") String address);

    Person withNameAndAddressNamedQuery(String name, String address);

}

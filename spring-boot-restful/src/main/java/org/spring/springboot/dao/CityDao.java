package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;

import java.util.List;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/25 0025 17:14
 */
public interface CityDao {

    List<City> findAllCity();

    City findById(@Param("id") Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
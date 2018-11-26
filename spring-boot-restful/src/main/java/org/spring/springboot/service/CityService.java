package org.spring.springboot.service;

import org.spring.springboot.domain.City;

import java.util.List;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/25 0025 17:15
 */
public interface CityService {

    List<City> findAllCity();

    City findCityById(Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
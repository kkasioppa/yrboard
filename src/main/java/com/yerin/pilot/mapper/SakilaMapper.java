package com.yerin.pilot.mapper;

import com.yerin.pilot.model.City;
import com.yerin.pilot.model.Country;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface SakilaMapper {
    public List<Country> getCountry();
    public List<City> getCity(Map<String, Object> param);
}

//@Select("select * from country")
//@Select("select country_id as countryId, country, DATE_FORMAT(last_update, '%Y-%m-%d %T') as aaa from country")

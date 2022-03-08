package com.yerin.pilot.mapper;

import com.yerin.pilot.model.Country;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SakilaMapper {

    //@Select("select * from country")
    @Select("select country_id, country, DATE_FORMAT(last_update, '%Y-%m-%d %T') as aaa from country")
    List<Country> getCountry();
}

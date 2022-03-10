package com.yerin.pilot.service;

import com.yerin.pilot.mapper.SakilaMapper;
import com.yerin.pilot.model.City;
import com.yerin.pilot.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedCaseInsensitiveMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SakilaService {

    @Autowired
    private SakilaMapper sakilaMapper; // = new SailaMapper();

    public List<Country> getCountry() {
        List<Country> countryList = sakilaMapper.getCountry();
        return countryList;
    }

    public List<City> getCity(String countryId) {
        Map<String, Object> param = new HashMap<>();
        param.put("countryId", countryId);
        List<City> cityList = sakilaMapper.getCity(param);
        return cityList;
    }
}

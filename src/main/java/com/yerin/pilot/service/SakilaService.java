package com.yerin.pilot.service;

import com.yerin.pilot.mapper.SakilaMapper;
import com.yerin.pilot.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SakilaService {

    @Autowired
    private SakilaMapper sakilaMapper; // = new SailaMapper();

    public List<Country> getCountry() {
        List<Country> countryList = sakilaMapper.getCountry();
        return countryList;
    }
}

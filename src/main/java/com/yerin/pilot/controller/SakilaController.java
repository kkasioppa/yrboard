package com.yerin.pilot.controller;

import com.yerin.pilot.model.Country;
import com.yerin.pilot.service.SakilaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class SakilaController {

    @Autowired
    private SakilaService sakilaService;

    @RequestMapping("/country")
    public ResponseEntity getCountry() {
        List<Country> countryList = sakilaService.getCountry();
        ResponseEntity result = new ResponseEntity(countryList, HttpStatus.OK);
        return result; // new ResponseEntity(countryList, HttpStatus.OK);
    }

    @RequestMapping("/cc")
    public String getTemp() {
        return "temp";
    }

}

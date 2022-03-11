package com.yerin.pilot.controller;

import com.yerin.pilot.model.City;
import com.yerin.pilot.model.Country;
import com.yerin.pilot.service.SakilaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/temp")
    public String temp() {
        return "temp";
    }

    @Autowired
    private SakilaService sakilaService;

    @RequestMapping("/countrylist")
    public ModelAndView getCountryList() {
        ModelAndView model = new ModelAndView("countrycity");
        // db에서 값 가져오기..??
        List<Country> result = sakilaService.getCountry();
        model.addObject("country", result);
        return model;
    }

    @RequestMapping(value="/countrycity", method = RequestMethod.GET)
    public ModelAndView getCountryCity(HttpServletRequest request) {
        String countryId = request.getParameter("countryId");

        ModelAndView model = new ModelAndView("countrycity");

        List<Country> result = sakilaService.getCountry();
        List<City> result2 = sakilaService.getCity(countryId);
        model.addObject("countryId", countryId);
        model.addObject("country", result);
        model.addObject("city", result2);
        return model;
    }

    @RequestMapping("/aaa")
    public ModelAndView getAaa(HttpServletRequest request) {
        String text = request.getParameter("text");
        ModelAndView model = new ModelAndView("aaa");
        model.addObject("text", text);
        return model;
    }

    @RequestMapping("/hello")
    public ModelAndView hello() {
        ModelAndView model = new ModelAndView("hello");

        // DB에서 뭔가 읽어와서
        // 저 param1에다가 넣어서 보내면...
        // jsp에서는 그 값을 받아서 처리할 수 있잖아..

        model.addObject("param1", "채린이");
        model.addObject("param2", "짜장쓰");
        return model;
    }

    @RequestMapping("/login") // ?user=예린이   or ?user=...
    public ModelAndView login(HttpServletRequest request) {
        String user = request.getParameter("user");
        ModelAndView model = new ModelAndView("login");
        if(user.equals("예린이")) {
            model.addObject("param1", "예린이는 바보");
        } else {
            model.addObject("param1", user + "는 바보아닌데 헤헤헤");
        }
        return model;
    }

    @RequestMapping("/valid")
    public String valid() {
        return "valid";
    }
}

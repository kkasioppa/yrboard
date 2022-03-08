package com.yerin.pilot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping("/temp")
    public String temp() {
        return "temp";
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

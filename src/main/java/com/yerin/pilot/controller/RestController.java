package com.yerin.pilot.controller;

import com.yerin.pilot.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(value = "/dovalidate", method = RequestMethod.GET)
    public String dovalidate(HttpServletRequest request) {
        String user = request.getParameter("user");
        if (user.equals("예린이")) {
            return "금마 거 완전... ㅇㅏ후... 진짜 ... 아...";
        } else if (user.equals("짜장쓰")) {
            return "금마는 예린이 보다 좀 낫제...";
        } else {
            return "갸는 잘 모르겄는디요...흐흐";
        }
    }
}

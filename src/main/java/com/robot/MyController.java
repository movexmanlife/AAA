package com.robot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @RequestMapping("/view")
    public ModelAndView view(HttpServletRequest request) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
        String path = request.getParameter("path") + "";
        ModelAndView mav = new ModelAndView();

        mav.setViewName(path);
        return mav;
    }
}
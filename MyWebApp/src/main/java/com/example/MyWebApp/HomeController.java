package com.example.MyWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
    @RequestMapping("home")
    public ModelAndView home(Tests tests){
        //HttpSession session = req.getSession();
        //String name =req.getParameter("name");
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj" ,tests);
        mv.setViewName("home");
        //System.out.println("hi "+myName);
        //session.setAttribute("name", myName);
        return mv;
    }
}

package com.example.bootjpa.controller;

import com.example.bootjpa.dao.AlienRepo;
import com.example.bootjpa.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {
    @Autowired
    AlienRepo repo;
    @RequestMapping("/")
    public String home(){

        return "home.jsp";
    }
    @RequestMapping("/addAlien")
    public String addAlien(Alien alien){
        repo.save(alien);
        return "home.jsp";
    }
    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid){
        ModelAndView mv= new ModelAndView();
        Alien alien = repo.findById(aid).orElse(new Alien());
        System.out.println(repo.findByTech("java"));
        System.out.println(repo.findByAidGreaterThan(102));
        System.out.println(repo.findByTechSorted("java"));
        mv.addObject(alien);
        mv.setViewName("showAlien.jsp");
        return mv;
    }

}

package com.example.bootjpa.controller;

import com.example.bootjpa.dao.AlienRepo;
import com.example.bootjpa.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
    @RequestMapping("/aliens")
    @ResponseBody
    public String getAliens(){
        return repo.findAll().toString();
    }
    @RequestMapping("/alien/101")
    @ResponseBody
    public String getAlien(){
        return repo.findById(101).toString();
    }
    //@RequestMapping("/alien/{aid}")
    //@ResponseBody
    //public String getAlien(@PathVariable("aid") int aid){
      //  return repo.findById(aid).toString();
//TO FETCH ALL VALUES
}

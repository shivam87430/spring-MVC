package com.ttn.bootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/shivam")
    ModelAndView print(){
        ModelAndView modelAndView=new ModelAndView("test");/*
        modelAndView.addObject("msg","Shivam");*/
        return modelAndView;
    }

    @RequestMapping("/submit")
    ModelAndView submit(@RequestParam String name){
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("msg",name);
        return modelAndView;
    }
}

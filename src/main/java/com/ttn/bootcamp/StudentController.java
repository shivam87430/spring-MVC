package com.ttn.bootcamp;

import Model.StudentCO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class StudentController {
   /* *//*Question 3*//*
    @RequestMapping("/")
    public ModelAndView renderPage(){
        ModelAndView modelAndView=new ModelAndView("index");
        return modelAndView;
    }*/

    /*Question 4*/
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }

    /*Question 5*/
    @RequestMapping("/send")
    public ModelAndView printHelloWorld(){
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("helloworld","Hello World");
        return modelAndView;
    }

    @RequestMapping("/send1")
    public ModelAndView printHelloWorld1(){
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("helloworld","Hello World!!!!");
        return modelAndView;
    }

    /*Question 6*/
    @RequestMapping("/fetchStudent/{firstName}/{lastName}")
    @ResponseBody
    public String fetchData(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName){
        return firstName + " " + lastName;
    }

    /*Question 7*/
    @RequestMapping("/fetchThroughMap/{firstName}/{lastName}")
    @ResponseBody
    public String fetchThroughMap(@PathVariable Map<String , String> stringMap){
        return stringMap.get("firstName") + " "+stringMap.get("lastName");
    }

    /*Question 8*/
    @RequestMapping("/fetchData")
    public ModelAndView fetching(@RequestParam("firstName") String fName,@RequestParam("lastName") String lName){
        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("fName",fName);
        modelAndView.addObject("lName",lName);
        return modelAndView;
    }

    /*Question 9*/
    @RequestMapping("/StudentForm")
    public ModelAndView getStudentForm(){
        ModelAndView modelAndView=new ModelAndView("StudentForm");
        return modelAndView;
    }

    @RequestMapping("/submitform")
    public ModelAndView SubmitStudentData(@RequestParam("studentFirstName") String fName,
                                          @RequestParam("studentLastName") String lName)
    {
        StudentCO studentCO=new StudentCO();
        studentCO.setStudentFirstName(fName);
        studentCO.setStudentLastName(lName);

        ModelAndView modelAndView=new ModelAndView("DisplayStudentData");
        modelAndView.addObject("studentCO",studentCO);
        return modelAndView;
    }

    /*Question 10*/
    @ModelAttribute
    void addingHeading(Model model){
        model.addAttribute("heading","Spring MVC Demo");
    }
    @RequestMapping("/submitform1")
    public ModelAndView SubmitStudentData1(@ModelAttribute("studentCO") StudentCO studentCO)
    {

        ModelAndView modelAndView=new ModelAndView("DisplayStudentData");
        modelAndView.addObject("studentCO",studentCO);
        return modelAndView;
    }


}

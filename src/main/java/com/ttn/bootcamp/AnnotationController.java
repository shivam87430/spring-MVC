package com.ttn.bootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/annotation")
public class AnnotationController {

    @ResponseBody
    @RequestMapping("/index")
    String index() {
        return "index";
    }

    @ResponseBody
    @RequestMapping("/demoAction")
    String demoAction() {
        return "demoAction";
    }
}

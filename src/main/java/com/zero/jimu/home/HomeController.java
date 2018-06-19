package com.zero.jimu.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@Controller
public class HomeController {
    @RequestMapping("/")
    public String HomeData(){
        return "Hello,Jimu";
    }
}

package com.test.views.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zsw on 15-4-1.
 * 首页
 */
@Controller
public class IndexController {


    @RequestMapping(value = "/index.do",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}

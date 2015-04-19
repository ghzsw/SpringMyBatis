package com.test.views.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zsw on 15-4-7.
 */
@Controller
public class ErrorController {

    @RequestMapping(value = "/error400.do",method = RequestMethod.GET)
    public String error400(){
        return "/pages/common/pages/error400";
    }

}

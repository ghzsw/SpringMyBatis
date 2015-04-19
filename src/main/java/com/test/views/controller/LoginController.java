package com.test.views.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zsw on 15-4-7.
 */
@Controller
public class LoginController {

    private final static String MODELPATHSUFIX="/pages/login/";

    @RequestMapping(value = "/login.do",method = RequestMethod.GET)
    public String login(){
        return  MODELPATHSUFIX+"login";
    }

}

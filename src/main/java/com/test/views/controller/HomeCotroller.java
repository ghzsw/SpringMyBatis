package com.test.views.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zsw on 15-4-7.
 */
@Controller
public class HomeCotroller {

    private final static String MODELPATHSUFIX="/pages/home/";

    @RequestMapping(value = "/home.do")
    public String home(){
        return MODELPATHSUFIX+"home";
    }

}

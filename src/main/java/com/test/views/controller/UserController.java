package com.test.views.controller;

import com.test.domain.User;
import com.test.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zsw on 15-3-14.
 */
@Controller
public class UserController {


    private Iservice iservice;

    @Autowired
    public void setIservice(Iservice iservice) {
        this.iservice = iservice;
    }

    @RequestMapping(value = "/getAll.do",method = RequestMethod.GET)
    public @ResponseBody List<User> getUser(){
        return iservice.getAll();

    }
}

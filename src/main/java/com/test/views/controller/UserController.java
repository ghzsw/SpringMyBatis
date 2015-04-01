package com.test.views.controller;

import com.test.domain.User;
import com.test.json.MessageJson;
import com.test.service.Iservice;
import com.test.utils.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public @ResponseBody MessageJson getUser(){
        return JSONUtils.getMessage(iservice.getAll());

    }

    @RequestMapping(value = "/saveUser.do",method = RequestMethod.POST,consumes="application/json")
    public @ResponseBody MessageJson saveUser (@RequestBody User user) throws Exception{

        return  JSONUtils.getMessage(iservice.insert(user));
    }

    @RequestMapping(value = "/updateUser.do",method = RequestMethod.POST)
    public @ResponseBody MessageJson upateByUser (@RequestBody User user){


            return  JSONUtils.getMessage(iservice.upateByUser(user));
    }
    @RequestMapping(value = "/deleteUser.do",method = RequestMethod.POST)
    public @ResponseBody MessageJson deleteByUser(@RequestBody User user){
        return  JSONUtils.getMessage(iservice.deleteByUser(user));

    }
}

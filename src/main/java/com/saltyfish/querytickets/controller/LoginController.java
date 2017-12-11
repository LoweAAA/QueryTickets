package com.saltyfish.querytickets.controller;


import com.saltyfish.querytickets.model.LoginEntity;
import com.saltyfish.querytickets.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class LoginController {

    @Autowired
    private LoginService loginService;


    @RequestMapping("loginconfirm")
    @ResponseBody
    public Map loginConfirm(@RequestParam("username") String username,@RequestParam("password") String password){
        System.out.println(username+password);
        Map map=new HashMap();
        LoginEntity loginEntity=loginService.loginConfirm(username,password);
        map.put("data",loginEntity);
        if(loginEntity==null){
            map.put("status",201);
        }
        else map.put("status",200);
        return map;
    }



}

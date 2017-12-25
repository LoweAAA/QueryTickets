package com.saltyfish.querytickets.controller;

import com.saltyfish.querytickets.model.LoginEntity;
import com.saltyfish.querytickets.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/getusers")
    @ResponseBody
    public Map getUsers(){
        Map map=new HashMap();
        List users=loginService.getAccount(0);
        map.put("data",users);
        if(users==null){
            map.put("status",201);
        }
        else map.put("status",200);
        return map;
    }

    @RequestMapping("/addusers")
    @ResponseBody
    public Map addUsers(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("name") String name){
        Map map=new HashMap();
        LoginEntity loginEntity=new LoginEntity();
        loginEntity.setPassword(password);
        loginEntity.setUsername(username);
        loginEntity.setName(name);
        loginEntity.setType(0);
        try{
            loginService.addAccount(loginEntity);
            map.put("message","用户添加成功");
            map.put("status","200");
        }catch (Exception e){
            map.put("message","用户添加失败");
            map.put("status","201");
        }

        return map;
    }

    @RequestMapping("/deleteusers")
    @ResponseBody
    public Map addUsers(@RequestParam("userid") Integer userid){
        Map map=new HashMap();


        try{
            loginService.delete(userid);
            map.put("message","用户删除成功");
            map.put("status","200");
        }catch (Exception e){
            map.put("message","用户删除失败");
            map.put("status","201");
        }

        return map;
    }

    @RequestMapping("/updateusers")
    @ResponseBody
    public Map updateUsers(@RequestParam("userid") Integer userid,@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("name") String name){
        Map map=new HashMap();
        LoginEntity loginEntity=new LoginEntity();
        loginEntity.setPassword(password);
        loginEntity.setUsername(username);
        loginEntity.setName(name);
        loginEntity.setType(0);
        loginEntity.setId(userid);
        try{
            loginService.update(loginEntity);
            map.put("message","用户修改成功");
            map.put("status","200");
        }catch (Exception e){
            map.put("message","用户修改失败");
            map.put("status","201");
        }

        return map;
    }







}

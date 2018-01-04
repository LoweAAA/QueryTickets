package com.saltyfish.querytickets.controller;


import com.saltyfish.querytickets.model.TrainEntity;
import com.saltyfish.querytickets.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/train")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @RequestMapping("/getall")
    @ResponseBody
    public Map getall(){
        Map map = new HashMap();
        List<TrainEntity> trainEntities = trainService.getall();
        map.put("data", trainEntities);
        if (trainEntities != null)
            map.put("status", 200);
        else
            map.put("status", 201);
        return map;
    }

    @RequestMapping("/add")
    @ResponseBody
    public Map add(@RequestParam("number") String number,
                   @RequestParam("specialSeat") Integer specialSeat,
                   @RequestParam("firstSeat") Integer firstSeat,
                   @RequestParam("secondSeat") Integer secondSeat,
                   @RequestParam("softSeat") Integer softSeat,
                   @RequestParam("hardSeat") Integer hardSeat,
                   @RequestParam("noSeat") Integer noSeat,
                   @RequestParam("highSleeper") Integer highSleeper,
                   @RequestParam("softSleeper") Integer softSleeper,
                   @RequestParam("hardSleeper") Integer hardSleeper){
        Map map=new HashMap();
        try{
            trainService.add(number,specialSeat,firstSeat,secondSeat,softSeat,hardSeat,noSeat,highSleeper,softSleeper,hardSleeper);
            map.put("message","车次添加成功");
            map.put("status",200);
        }catch (Exception e){
            map.put("message","车次添加失败");
            map.put("status",201);
        }
        return map;
    }

    @RequestMapping("/update")
    @ResponseBody
    public Map add(@RequestParam("id") Integer id,
                   @RequestParam("number") String number,
                   @RequestParam("specialSeat") Integer specialSeat,
                   @RequestParam("firstSeat") Integer firstSeat,
                   @RequestParam("secondSeat") Integer secondSeat,
                   @RequestParam("softSeat") Integer softSeat,
                   @RequestParam("hardSeat") Integer hardSeat,
                   @RequestParam("noSeat") Integer noSeat,
                   @RequestParam("highSleeper") Integer highSleeper,
                   @RequestParam("softSleeper") Integer softSleeper,
                   @RequestParam("hardSleeper") Integer hardSleeper){
        Map map=new HashMap();
        try{
            trainService.update(id,number,specialSeat,firstSeat,secondSeat,softSeat,hardSeat,noSeat,highSleeper,softSleeper,hardSleeper);
            map.put("message","车次修改成功");
            map.put("status",200);
        }catch (Exception e){
            map.put("message","车次修改失败");
            map.put("status",201);
        }
        return map;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Map delete(@RequestParam("id") int id){
        Map map=new HashMap();
        try{
            trainService.delete(id);
            map.put("message","车次删除成功");
            map.put("status",200);
        }catch (Exception e){
            map.put("message","车次删除失败");
            map.put("status",201);
        }
        return map;
    }
}

package com.saltyfish.querytickets.controller;

import com.saltyfish.querytickets.dao.TrainStationDistanceDao;
import com.saltyfish.querytickets.model.TrainStationDistanceEntity;
import com.saltyfish.querytickets.model.TrainStationEntity;
import com.saltyfish.querytickets.service.StationDistanceService;
import com.saltyfish.querytickets.service.TrainStationService;
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
@RequestMapping("/distance")
public class StationDistanceController {

    @Autowired
    private StationDistanceService stationDistanceService;

    @RequestMapping("/getall")
    @ResponseBody
    public Map getAll() {
        Map map = new HashMap();
        List<TrainStationDistanceEntity> trainStationDistanceEntities = stationDistanceService.getAll();
        map.put("data", trainStationDistanceEntities);
        if (trainStationDistanceEntities != null)
            map.put("status", 200);
        else
            map.put("status", 201);
        return map;
    }
    @RequestMapping("/add")
    @ResponseBody
    public Map add(@RequestParam("startstation") String startStation,@RequestParam("endstation") String endStation,@RequestParam("distance") double distance){
        Map map=new HashMap();
        try{
            stationDistanceService.add(distance,startStation,endStation);
            map.put("message","站点距离添加成功");
            map.put("status",200);
        }catch (Exception e){
            map.put("message","站点距离添加失败");
            map.put("status",201);
        }
        return map;

    }

    @RequestMapping("/delete")
    @ResponseBody
    public Map delete(@RequestParam("id") int id){
        Map map=new HashMap();
        try{
            stationDistanceService.delete(id);
            map.put("message","站点距离删除成功");
            map.put("status",200);
        }catch (Exception e){
            map.put("message","站点距离删除失败");
            map.put("status",201);
        }
        return map;
    }

    @RequestMapping("update")
    @ResponseBody
    public Map update(@RequestParam("id") int id,@RequestParam("distance") double distance){
        Map map=new HashMap();
        try{
            stationDistanceService.update(id,distance);
            map.put("message","站点距离修改成功");
            map.put("status",200);
        }catch (Exception e){
            map.put("message","站点距离修改失败");
            map.put("status",201);
        }
        return map;
    }
}

package com.saltyfish.querytickets.controller;

import com.saltyfish.querytickets.model.TrainStationEntity;
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
@RequestMapping("/station")
public class TrainStationController {

    @Autowired
    private TrainStationService trainStationService;

    @RequestMapping("/getall")
    @ResponseBody
    public Map getAll() {
        Map map = new HashMap();
        List<TrainStationEntity> trainStationEntities = trainStationService.getAll();
        map.put("data", trainStationEntities);
        if (trainStationEntities != null)
            map.put("status", 200);
        else
            map.put("status", 201);
        return map;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Map delete(@RequestParam("id") int id){
        Map map=new HashMap();
        try{
            trainStationService.delete(id);
            map.put("message","站点删除成功");
            map.put("status",200);
        }catch (Exception e){
            map.put("message","站点删除失败");
            map.put("status",201);
        }
        return map;
    }

    @RequestMapping("update")
    @ResponseBody
    public Map update(@RequestParam("id") int id,@RequestParam("station") String station){
        Map map=new HashMap();
        TrainStationEntity trainStationEntity=new TrainStationEntity();
        trainStationEntity.setStation(station);
        trainStationEntity.setId(id);
        try{
            trainStationService.update(trainStationEntity);
            map.put("message","站点修改成功");
            map.put("status",200);
        }catch (Exception e){
            map.put("message","站点修改失败");
            map.put("status",201);
        }
        return map;
    }

    @RequestMapping("/add")
    @ResponseBody
    public Map add(@RequestParam("station") String station){
        Map map=new HashMap();
        TrainStationEntity trainStationEntity=new TrainStationEntity();
        trainStationEntity.setStation(station);
        try{
            trainStationService.add(trainStationEntity);
            map.put("message","站点添加成功");
            map.put("status",200);
        }catch (Exception e){
            map.put("message","站点添加失败");
            map.put("status",201);
        }
        return map;

    }
}

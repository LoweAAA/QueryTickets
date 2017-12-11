package com.saltyfish.querytickets.controller;

import com.saltyfish.querytickets.model.TrainStationEntity;
import com.saltyfish.querytickets.service.TrainStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class TrainStationController {

    @Autowired
    private TrainStationService trainStationService;

    @RequestMapping
    @ResponseBody
    public Map getAll() {
        Map map = new HashMap();
        List<TrainStationEntity> trainStationEntities = trainStationService.getAll();
        map.put("date", trainStationEntities);
        if (trainStationEntities != null)
            map.put("status", 200);
        else
            map.put("status", 201);
        return map;
    }
}

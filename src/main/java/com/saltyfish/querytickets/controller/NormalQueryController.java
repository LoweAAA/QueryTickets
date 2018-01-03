package com.saltyfish.querytickets.controller;

import com.saltyfish.querytickets.service.NormalQueryService;
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
public class NormalQueryController {

    @Autowired
    private NormalQueryService normalQueryService;

    @RequestMapping("stationQuery")
    @ResponseBody
    public Map<String, Object> stationQuery(@RequestParam("startStation") String startStation, @RequestParam("endStation") String endStation, @RequestParam("orderBy") String orderBy) {
        Map<String, Object> map = new HashMap<>();
        List list = normalQueryService.order(startStation, endStation, orderBy);
        map.put("data", list);
        if (list.size() == 0) {
            map.put("status", 201);
        } else {
            map.put("status", 200);
        }
        return map;
    }

    @RequestMapping("changestationquery")
    @ResponseBody
    public Map<String, Object> changeStationQuery(@RequestParam("startStation") String startStation, @RequestParam("endStation") String endStation) {
        Map<String, Object> map = new HashMap<>();
        List list = normalQueryService.change(startStation, endStation);
        if (list.size() == 0) {
            map.put("message","未查询到中间车站");
            map.put("status", 201);
        } else {
            map.put("message", list);
            map.put("status", 200);
        }
        return map;
    }

    @RequestMapping("changetrainquery")
    @ResponseBody
    public Map<Object, Object> changeTrainQuery(@RequestParam("startStation") String startStation, @RequestParam("endStation") String endStation, @RequestParam("changeStation") String changeStation) {
        Map<Object, Object> map = new HashMap<>();
        List list = normalQueryService.changeTrain(startStation, endStation, changeStation);
        if (list.size() == 0) {
            map.put("message", "未查询到中转车次");
            map.put("status", 201);
        } else if (list.get(0).equals("err")) {
            map.put("message", "系统错误");
            map.put("status", 202);
        } else {
            map.put("message", list);
            map.put("status", 200);
        }
        return map;
    }
}

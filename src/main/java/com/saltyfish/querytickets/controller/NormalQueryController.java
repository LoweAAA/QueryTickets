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
}

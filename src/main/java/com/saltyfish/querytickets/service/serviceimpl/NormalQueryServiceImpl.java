package com.saltyfish.querytickets.service.serviceimpl;

import com.saltyfish.querytickets.dao.NormalQueryDao;
import com.saltyfish.querytickets.service.NormalQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NormalQueryServiceImpl implements NormalQueryService {

    @Autowired
    private NormalQueryDao normalQueryDao;

    public List queryByStation(String startStation, String endStation) {
        List start = normalQueryDao.queryByStation(startStation);
        List end = normalQueryDao.queryByStation(endStation);
        return null;
    }
}

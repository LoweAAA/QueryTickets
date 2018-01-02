package daoTest;

import com.saltyfish.querytickets.dao.*;
import com.saltyfish.querytickets.model.*;
import com.saltyfish.querytickets.service.LoginService;
import com.saltyfish.querytickets.service.NormalQueryService;
import com.saltyfish.querytickets.service.StationDistanceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-hibernate.xml")
public class test {


    @Autowired
    private TrainStationDistanceDao trainStationDistanceDao;
    @Autowired
    private LoginDao LoginDao;
    @Autowired
    private NormalQueryDao normalQueryDao;
    @Autowired
    private TrainPassByStationDao trainPassByStationDao;

    @Autowired
    private TrainStationDao trainStationDao;

    @Autowired
    private LoginService loginService;
    @Autowired
    private NormalQueryService normalQueryService;

    @Autowired
    private StationDistanceService stationDistanceService;


    @Test
    public void testAdd() {
        LoginEntity loginEntity = new LoginEntity();
        loginEntity.setUsername("ccc");
        loginEntity.setPassword("ccc");
        LoginDao.add(loginEntity);
    }

    @Test
    public void testGetAll() {
        System.out.println(LoginDao.getAll(0));
    }

    @Test
    public void testQueryByUsername() {
        System.out.println(LoginDao.queryByUsername("aaa"));
    }

    @Test
    public void testLoginConfirm() {
        System.out.println(loginService.loginConfirm("aa", "aa"));
    }

    @Test
    public void testQueryByStation() {
        System.out.println(normalQueryDao.queryByStation("北京"));
    }

    @Test
    public void testOrderByMoney() {
        System.out.println(normalQueryService.order("北京", "杭州", "money"));
    }

    @Test
    public void testQueryByNumber() {
        System.out.println(normalQueryDao.queryByNumber("G564"));
    }

//    @Test
//    public void testAddTrainPassByStation(){
//        trainPassByStationsEntity.set
//        trainPassByStationDao.add(trainPassByStationsEntity);
//    }

    @Test
    public void testStationGetAll() {
        TrainStationDistanceEntity trainStationDistanceEntity = new TrainStationDistanceEntity();
        TrainStationEntity trainStationEntity = new TrainStationEntity();
        TrainStationEntity trainStationEntity2 = new TrainStationEntity();
        trainStationEntity.setId(3);
        trainStationEntity2.setId(4);
        trainStationDistanceEntity.setTrainStationByStart(trainStationEntity);
        trainStationDistanceEntity.setDistance(947.56);
        trainStationDistanceEntity.setTrainStationByEnd(trainStationEntity2);
        trainStationDistanceDao.add(trainStationDistanceEntity);
    }

    @Test
    public void testtrainPassByStation() {
        System.out.println(trainPassByStationDao.getAll());
    }

    @Test
    public void testtrainstation() {
        System.out.println(trainStationDao.getByName("上海").getStation());
    }

    @Test
    public void testtdisadd() {
        stationDistanceService.add(14, "上海", "北京");
    }

    @Test
    public void testChange() {
        System.out.println(normalQueryService.change("杭州", "开化"));
    }

    @Test
    public void testQueryTime() {
        System.out.println(normalQueryDao.queryTime("D321", "龙游"));
    }

    @Test
    public void testChangeTrain() {
        System.out.println(normalQueryService.changeTrain("杭州", "开化", ""));
    }
}

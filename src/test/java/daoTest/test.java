package daoTest;

import com.saltyfish.querytickets.dao.LoginDao;
import com.saltyfish.querytickets.dao.NormalQueryDao;
import com.saltyfish.querytickets.model.LoginEntity;
import com.saltyfish.querytickets.model.TrainEntity;
import com.saltyfish.querytickets.model.TrainPassByStationsEntity;
import com.saltyfish.querytickets.service.LoginService;
import com.saltyfish.querytickets.service.NormalQueryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-hibernate.xml")
public class test {

    @Autowired
    private TrainPassByStationsEntity trainPassByStationsEntity;
    @Autowired
    private TrainEntity trainEntity;

    @Autowired
    private LoginDao LoginDao;
    @Autowired
    private NormalQueryDao normalQueryDao;

    @Autowired
    private LoginService loginService;
    @Autowired
    private NormalQueryService normalQueryService;


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
    public void testNormalQueryService() {
        System.out.println(normalQueryService.queryByStation("北京", "杭州"));
    }

}

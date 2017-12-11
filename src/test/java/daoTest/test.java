package daoTest;

import com.saltyfish.querytickets.dao.loginDao;
import com.saltyfish.querytickets.model.LoginEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-hibernate.xml")
public class test {

    @Autowired
    private loginDao loginDao;


    @Test
    public void testAdd() {
        LoginEntity loginEntity = new LoginEntity();
        loginEntity.setUsername("bbb");
        loginEntity.setPassword("bbb");
        loginDao.add(loginEntity);
    }

    @Test
    public void testGetAll() {
        System.out.println(loginDao.getAll());
    }
}

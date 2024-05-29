package config;


import dao.UserDao;
import entity.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.UserService;
import service.Utils.IDMake;

public class TestJDBC {
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(SpringJDBCConfig.class);
//        UserService us = appCon.getBean(UserService.class);
//        us.userJDBC();
//        appCon.close();
//    }
    @Test
    public void Test01(){
        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(SpringJDBCConfig.class);
        UserDao bean = appCon.getBean(UserDao.class);
        for (User user : IDMake.getName_Sex_age(10)) {
            bean.update(user);
        }

    }
}

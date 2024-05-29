package config;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.UserService;

public class TestJDBC {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(SpringJDBCConfig.class);
        UserService us = appCon.getBean(UserService.class);
        us.userJDBC();
        appCon.close();
    }
}

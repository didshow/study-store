package test;

import dao.TestDao;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    public static void main(String[] args) {
        //初始化Spring容器ApplicationContext,加载配置文件
        //@SuppressWarnings抑制警告的关键字，有泛型的未指定类型
        @SuppressWarnings("resource")
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取test实例
        TestDao tt = (TestDao) appCon.getBean("test");//test为配置文件中的id
        tt.sayHello();
    }
}

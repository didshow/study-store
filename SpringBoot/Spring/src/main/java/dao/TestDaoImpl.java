package dao;

import org.springframework.stereotype.Repository;
@Repository("testDaoImpl")
public class TestDaoImpl implements TestDao{
    @Override
    public void sayHello() {
        System.out.println("Hello Study Hard!");
    }

    @Override
    public void save() {
        System.out.println("TestDao save");
    }
}

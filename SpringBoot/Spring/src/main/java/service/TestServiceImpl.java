package service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("testDaoImpl")
public class TestServiceImpl implements TestService{
    @Resource(name="testDaoImpl")
    @Override
    public void save() {
        
    }
}

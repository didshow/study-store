package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Person;

import java.util.List;
import java.util.Map;

@Controller
public class TestJsonController {
    @RequestMapping("/input")
    public String input(){
        return "input";
    }
    @RequestMapping("/testJson")
    @ResponseBody
    public List<Map<String,Object>> testJson(@RequestBody Person user){
        System.out.println("name="+user.getName()+"，password="+user.getPassword()+",age="+user.getPage());
        Person p1 = new Person();
        p1.setName("陈恒1");
        p1.setPage(80);
        p1.setPassword("123456");
        allp.add(p1);
    }
}

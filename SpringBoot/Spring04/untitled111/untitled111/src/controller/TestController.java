package controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pojo.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangchao on 2021/11/30.
 */

@Controller
public class TestController {

    /**
     * 接受页面请求的JSON数据，并返回JSON格式结果
     */


    @RequestMapping(value = "/testJson",method = RequestMethod.POST)
    @ResponseBody
    public List<Map<String,Object>> testJson(  @RequestBody Person user){

        //打印接受的JSON格式数据
        System.out.println("pname="+user.getPname()+",password="+user.getPassword()+",page="+user.getPage());
        List<Map<String,Object>> allp = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();

        map.put("pname","陈恒2");
        map.put("password","123456");
        map.put("page", "25");

        Map<String,Object> map1 = new HashMap<>();
        map1.put("pname","陈恒3");
        map1.put("password","54321");
        map1.put("page", "55");

        allp.add(map);
        allp.add(map1);
        return allp;

    }
    @RequestMapping(value = "/test")
    @ResponseBody
    public Person cc(){
        System.out.println("test方法执行");
        Person p1 = new Person();
        p1.setPname("张三");
        p1.setPassword("123456");
        p1.setPage(1);
        return p1;
    }
}

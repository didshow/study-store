package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import pojo.Person;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class test {
    @Test
    public void test1() throws JsonProcessingException {
        Person p1 = new Person();
        p1.setPname("张三");
        p1.setPassword("123456");
        p1.setPage(1);
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(p1));
    }
    @Test
    public void test2() throws IllegalAccessException {
        Person p1 = new Person();
        p1.setPname("张三");
        p1.setPassword("123456");
        p1.setPage(1);

        Class c1 = p1.getClass();
        Field[] f1=c1.getDeclaredFields();
        System.out.println(f1);
        StringBuffer sb=new StringBuffer();
        sb.append("{");

        for(int i=0;i<f1.length;i++){
            f1[i].setAccessible(true);
            System.out.println(f1[i].getName());
            System.out.println(f1[i].get(p1).toString());
            sb.append('"');
            sb.append(f1[i].getName());
            sb.append('"');
            sb.append(':');
            sb.append(f1[i].get(p1).toString());
            if(i==f1.length-1){
                break;
            }
            sb.append(",");
        }
        sb.append("}");
        System.out.println(sb.toString());

    }

    @Test
    public void test3() throws JsonProcessingException {

        Person p1 = new Person();
        p1.setPname("张三");
        p1.setPassword("123456");
        p1.setPage(1);

        Person p2 = new Person();
        p1.setPname("李四");
        p1.setPassword("123456");
        p1.setPage(1);

        Person p3 = new Person();
        p1.setPname("王五");
        p1.setPassword("123456");
        p1.setPage(1);

        List<Person> userList=new ArrayList<Person>();
        userList.add(p1);
        userList.add(p2);
        userList.add(p3);
        //集合转json
        ObjectMapper objectMapper=new ObjectMapper();
        String listJson=objectMapper.writeValueAsString(userList);
        System.out.println(listJson);
    }

    @Test
    public void test4() throws IOException {

        String json="{\"pname\":\"admin\",\"password\":\"1111\"}";
        //将json对象转为java对象
        ObjectMapper objectMapper=new ObjectMapper();
        Person user=objectMapper.readValue(json,Person.class);
        System.out.println(user);
        System.out.println(user.getPname());
        System.out.println(user.getPassword());
    }


}

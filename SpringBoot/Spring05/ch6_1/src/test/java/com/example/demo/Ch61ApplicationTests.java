package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository1;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Scanner;

@SpringBootTest
@MapperScan("com.example.demo.repository")
class Ch61ApplicationTests {
    @Resource
	UserRepository1 userRepository1;
	@Test
	@Transactional
	void save() throws Exception {

		//插入一条记录
		User user =new User();
		user.setName("张三1");
		user.setSex("男1");
		userRepository1.save(user);

		//throw new Exception("异常看事务是否会执行成功");
	}

	@Test
	void select() {


		User user = userRepository1.findbyId(4);
		System.out.println(user.getId());
		System.out.println(user.getSex());
		System.out.println(user.getName());
	}

	@Test
	void update() {

		//插入一条记录
		User user =new User();
		user.setName("张三");
		user.setSex("男");
	}

	@Test
	void delete() {


	}




}

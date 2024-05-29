package com.example.demo.repository;

import com.example.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wangchao on 2021/12/13.
 */
public interface PersonRepository extends JpaRepository<Person,Integer>{

    /**
     *
     * @param id
     * @return
     * 根据身份ID查询人员信息（关联查询，根据idCard属性的id）
     */

    public Person findByIdCard_id(Integer id);


    /**
     *
     * @param pname
     * @param psex
     * @return
     * 根据人名和性别查询人员信息
     */
    public List<Person> findByPnameAndPsex(String pname,String psex);
}

package com.example.demo.service;

import com.example.demo.entity.IdCard;
import com.example.demo.entity.Person;

import java.util.List;

/**
 * Created by wangchao on 2021/12/13.
 */
public interface PersonAndIdCardService {

    public void saveAll();
    public List<IdCard> findAllIdCard();
    public List<Person> findAllPerson();

    public IdCard findByPerson_id(Integer id);
    public List<IdCard> findByAddressAndCode(String address,String code);
    public Person findByIdCard_id(Integer id);

    public List<Person> findByPnameAndPsex(String pname,String psex);

    public IdCard getOneIdCard(Integer id);

    public Person getOnePerson(Integer id);

    public void deleteonepersonbyid(Integer id);


}

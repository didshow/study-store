package com.example.demo.service;

import com.example.demo.entity.IdCard;
import com.example.demo.entity.Person;
import com.example.demo.repository.IdCardRepository;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by wangchao on 2021/12/13.
 */
@Service
public class PersonAndIdCardServiceImpl implements PersonAndIdCardService {
    @Autowired
    private IdCardRepository idCardRepository;

    @Autowired
    private PersonRepository personRepository;

    public void saveAll() {
        //保存身份证
        IdCard ic1 = new IdCard();
        ic1.setCode("123456789");
        ic1.setAddress("北京");
        Calendar c1 = Calendar.getInstance();
        c1.set(2021, 8, 13);
        ic1.setBirthday(c1);


        IdCard ic2 = new IdCard();
        ic2.setCode("00123456789");
        ic2.setAddress("上海");
        Calendar c2 = Calendar.getInstance();
        c2.set(2021, 8, 14);
        ic2.setBirthday(c2);


        IdCard ic3 = new IdCard();
        ic3.setCode("11123456789");
        ic3.setAddress("北京");
        Calendar c3 = Calendar.getInstance();
        c3.set(2021, 8, 15);
        ic3.setBirthday(c3);


        List<IdCard> idCards = new ArrayList<IdCard>();
        idCards.add(ic1);
        idCards.add(ic2);
        idCards.add(ic3);



        //保存人员

        Person p1 = new Person();
        p1.setPname("陈恒1");
        p1.setPsex("男");
        p1.setPage(88);
        p1.setIdCard(ic1);
        ic1.setPerson(p1);


        Person p2 = new Person();
        p2.setPname("陈恒2");
        p2.setPsex("女");
        p2.setPage(99);
        p2.setIdCard(ic2);
       ic2.setPerson(p2);



        Person p3 = new Person();
        p3.setPname("陈恒3");
        p3.setPsex("女");
        p3.setPage(18);
        p3.setIdCard(ic3);
        ic3.setPerson(p3);


        List<Person> persons = new ArrayList<Person>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        idCardRepository.saveAll(idCards);
        personRepository.saveAll(persons);












    }

    public List<IdCard> findAllIdCard() {
        return idCardRepository.findAll();
    }

    public List<Person> findAllPerson() {
        return personRepository.findAll();
    }

    public IdCard findByPerson_id(Integer id) {
        return idCardRepository.findByPerson_id(id);
    }

    public List<IdCard> findByAddressAndCode(String address, String code) {
        return idCardRepository.findByAddressAndCode(address,code);
    }

    public Person findByIdCard_id(Integer id) {
        return personRepository.findByIdCard_id(id);
    }

    public List<Person> findByPnameAndPsex(String pname, String psex) {
        return personRepository.findByPnameAndPsex(pname,psex);
    }

    public IdCard getOneIdCard(Integer id) {
        return idCardRepository.getOne(id);
    }

    public Person getOnePerson(Integer id) {
        return personRepository.getOne(id);
    }

    @Override
    public void deleteonepersonbyid(Integer id) {
        personRepository.deleteById(id);
    }
}

package com.example.demo.controller;

import com.example.demo.entity.IdCard;
import com.example.demo.entity.Person;
import com.example.demo.service.PersonAndIdCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wangchao on 2021/12/13.
 */

@RestController
public class TestOneToOneController {

    @Autowired
    private PersonAndIdCardService personAndIdCardService;
    @RequestMapping("/deleteonepersonbyid")
    public String deleteonepersonbyid(Integer id){
        personAndIdCardService.deleteonepersonbyid(id);
        return "删除某个person，观察级联的idcard";

    }



    @RequestMapping("/onesave")
    public String save(){
        personAndIdCardService.saveAll();
        return "人员和身份保存成功";
    }

    @RequestMapping("/onefindAllPerson")
    public List<Person> findAllPerson(){
        return personAndIdCardService.findAllPerson();
    }

    @RequestMapping("/onefindAllIdCard")
    public List<IdCard> findAllIdCard(){
        return personAndIdCardService.findAllIdCard();
    }


    @RequestMapping("/findByPerson_id")
    public IdCard findByPerson_id(Integer id){
        return personAndIdCardService.findByPerson_id(id);
    }


    @RequestMapping("/findByAddressAndCode")
    public List<IdCard> findByAddressAndCode(String address,String code){
        return personAndIdCardService.findByAddressAndCode(address, code);
    }

    @RequestMapping("/findByIdCard_id")
    public Person findByIdCard_id(Integer id){

        return personAndIdCardService.findByIdCard_id(id);
    }

    @RequestMapping("/findByPnameAndPsex")
    public List<Person> findByPnameAndPsex(String pname,String psex){

        return personAndIdCardService.findByPnameAndPsex(pname, psex);
    }

    @RequestMapping("/getOneIdCard")
    public IdCard getOneIdCard(Integer id){
        return personAndIdCardService.getOneIdCard(id);

    }

    @RequestMapping("/getOnePerson")
    public Person getOnePerson(Integer id){
        return  personAndIdCardService.getOnePerson(id);
    }


}

package com.example.demo.repository;

import com.example.demo.entity.IdCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wangchao on 2021/12/13.
 */
public interface IdCardRepository extends JpaRepository<IdCard,Integer>{

    /**
     *
     * @param id
     * @return
     *
     * 根据人员ID查询身份信息（关联查询，根据person属性的id）
     */
    public IdCard findByPerson_id(Integer id);


    /**
     *
     * @param address
     * @param code
     * @return
     *
     * 根据地址和身份证号查询身份信息
     */


    public List<IdCard> findByAddressAndCode(String address,String code);

}

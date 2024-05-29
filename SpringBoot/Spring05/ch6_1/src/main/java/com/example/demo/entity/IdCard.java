package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by wangchao on 2021/12/13.
 */

@Entity
@Table(name = "idcard_table")
@JsonIgnoreProperties(value = "hibernateLazyInitializer")
public class IdCard {
    private static  final  long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String code;

    /**
     * @Temporal主要是用来指明java.util.Date或java.util.Calendar
     * 类型的属性具体与数据库（date、time、timestamp）3个类型中的哪一个进行
     * 映射
     */
    @Temporal(value = TemporalType.DATE)
    private Calendar birthday;

    private String address;

    /**
     * optional=false设置person属性值不能为null，也就是身份证必须有
     * 对应的主人
     * mappedBy="idCard"与Person类中的idCard属性一致
     * 拥有mappedBy注解的实体类为关系的被维护端
     */
    @OneToOne(
            optional = false,
            fetch = FetchType.LAZY,
            targetEntity = Person.class,
            mappedBy = "idCard",
            cascade = CascadeType.ALL
    )
    private  Person person;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

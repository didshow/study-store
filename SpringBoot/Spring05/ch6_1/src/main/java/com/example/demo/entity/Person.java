package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by wangchao on 2021/12/13.
 */

@Entity
@Table(name = "person_table")
/**
 * 解决No serializer found for class org.hibernate.proxy.pojo.bytebuddy.ByteBuddyInterceptor
 */
@JsonIgnoreProperties(value = "hibernateLazyInitializer")
public class Person {


    private static final  long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pname;
    private String psex;
    private int page;

    @OneToOne(optional = true,
              fetch = FetchType.LAZY,
            targetEntity = IdCard.class,
            cascade = CascadeType.ALL
    )
    /**
     * 指明Person对应表的id_Card_id列作为外键与IdCard对应表的
     * id列进行关联
     * unique=true指明id_Card_id列的值不可重复
     */
    @JoinColumn(
            name = "id_Card_id",
            referencedColumnName = "id",
            unique = true
    )

    @JsonIgnore
    //如果A对象持有B的引用，B对象持有A的引用，这样就形成了循环引用
    //如果直接使用json转换会报错，使用@JsonIgnore解决该错误
    private IdCard idCard;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPsex() {
        return psex;
    }

    public void setPsex(String psex) {
        this.psex = psex;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }
}

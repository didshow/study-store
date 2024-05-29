package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private  Long id;
    private  String name;
    private  String sex;
    private  Integer age;
    private  String password;
}

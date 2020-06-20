package com.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhaomin
 * @date 2020/6/20 21:21
 */
@Getter
@Setter
public class Duck {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

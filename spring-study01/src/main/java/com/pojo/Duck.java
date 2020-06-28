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

    public Duck() {
    }

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

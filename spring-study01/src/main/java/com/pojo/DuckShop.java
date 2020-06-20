package com.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhaomin
 * @date 2020/6/20 21:21
 */
@Setter
@Getter
public class DuckShop {
    String name;
    List<Duck> list;

    @Override
    public String toString() {
        return "DuckShop{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}

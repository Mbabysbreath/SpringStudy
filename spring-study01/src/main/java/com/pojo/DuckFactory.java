package com.pojo;

/**
 * @author zhaomin
 * @date 2020/6/21 23:40
 */
public class DuckFactory {
    public Duck creat() {
        return new Duck("duck");
    }
    public static Duck creat2() {
        return new Duck("duck1");
    }
}

package com.min.pojo;

/**
 * @author zhaomin
 * @date 2020/6/20 12:56
 */
public class Hello {
    private String str;
    public String getStr(){
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}

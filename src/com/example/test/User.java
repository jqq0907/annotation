package com.example.test;

import com.example.anno.MyAnnotation1;

/**
 * @description:
 * @author: jqq
 * @time: 2021/4/20 15:39
 */
@MyAnnotation1(name = "小米", age = 12, id = 1)
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

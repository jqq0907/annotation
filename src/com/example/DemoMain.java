package com.example;

import com.example.anno.MyAnnotation1;
import com.example.test.User;

/**
 * @description:
 * @author: jqq
 * @time: 2021/4/16 13:18
 */
public class DemoMain {

    public static void main(String[] args) {
        Class<User> userClass = User.class;
        MyAnnotation1 annotation = userClass.getAnnotation(MyAnnotation1.class);
        System.out.println(annotation.name());
    }
}

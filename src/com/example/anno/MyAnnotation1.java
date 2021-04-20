package com.example.anno;

import java.lang.annotation.*;

/**
 * @author xiaoen
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotation1 {
    /**
     * 注解的参数,默认""
     *
     * @return
     */
    String name() default "";

    int age() default 0;

    /**
     * -1表示不存在
     *
     * @return
     */
    int id() default -1;
}

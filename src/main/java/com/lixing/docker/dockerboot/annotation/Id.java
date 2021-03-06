package com.lixing.docker.dockerboot.annotation;
import java.lang.annotation.*;
/**
 * title： com.lixing.docker.dockerboot.annotation
 * @author： lixing
 * date： 2018/4/14 12:48
 * description：ORM框架的Id注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Id {
    String name();
    String type() default "int";
    int length() default  20;
    int increment() default 1;
}

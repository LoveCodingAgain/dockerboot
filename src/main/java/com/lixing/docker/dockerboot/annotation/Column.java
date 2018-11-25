package com.lixing.docker.dockerboot.annotation;
import java.lang.annotation.*;
/**
 * title： com.lixing.docker.dockerboot.annotation
 * @author： lixing
 * date： 2018/4/14 13:32
 * description：ORM框架字段属性的注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Column {
     String name();
     String type() default "string";
     int length() default 20;
}

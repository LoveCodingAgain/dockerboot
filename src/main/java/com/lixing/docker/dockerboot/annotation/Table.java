package com.lixing.docker.dockerboot.annotation;
import java.lang.annotation.*;
/**
 * title： com.lixing.docker.dockerboot.annotation
 * @author： lixing
 * date： 2018/4/14 12:42
 * description：ORM框架的Table注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Table {
      String name();
}

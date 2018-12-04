package com.lixing.docker.dockerboot.entity;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
/**
 * title： com.lx.docker.dockerboot.entity
 *
 * @author： lixing
 * date： 2018/3/19 11:29
 * description：User实体类
 */
@Setter
@Getter
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String username;
    private Integer age;
    private String ctm;

    public User() {
        super();
    }

    public User(Integer id, String username, Integer age, String ctm) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.ctm = ctm;
    }

}

package com.lixing.docker.dockerboot.controller;

import com.lixing.docker.dockerboot.entity.User;
import com.lixing.docker.dockerboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: lixing
 * date: 2018-12-02
 * time: 13:28
 * description:声明式注解操作Redis.
 */
@RestController
@RequestMapping("/annot/redis")
public class AnnotRedisController {

    @Autowired
    private UserService userService;

    /**
     * 查询指定用户信息
     */
    @RequestMapping("/search/{id}")
    public User getUser(@PathVariable("id") String id) {
        User user = null;
        if (id != null) {
            user = userService.getUserById(id);
        }
        return user;
    }

    @RequestMapping("/update/{id}")
    public String updateUser(@PathVariable("id") String id) {
        if (id != null) {
            User user = new User();
            user.setId(Integer.valueOf(id));
            user.setUsername("Docker");
            user.setAge(25);
            userService.update(user);
            return "Update Success";
        }
        return "Update Fail";
    }

    /**
     * 删除指定用户信息
     */
    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") String id) {
        if (id != null) {
            userService.delete(id);
            return "Delete Success";
        }
        return "Delete Fail";
    }
}

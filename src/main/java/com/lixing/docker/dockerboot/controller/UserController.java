package com.lixing.docker.dockerboot.controller;

import com.lixing.docker.dockerboot.service.UserService;
import com.lixing.docker.dockerboot.entity.User;
import com.lixing.docker.dockerboot.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * title： com.lx.docker.dockerboot.controller
 *
 * @author： lixing
 * date： 2018/3/19 12:23
 * description：用户控制器
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 根据用户的编号查询用户信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable(value = "id") Integer id) {
        return userService.getUserById(String.valueOf(id));
    }

    /**
     * 查询用户列表
     *
     * @return
     */
    @RequestMapping("/users")
    public List<User> getUsers() {
        List<User> user = userService.getUserList();
        return user;
    }

    /**
     * 添加用户
     *
     * @return
     */
    @RequestMapping(value = "/user")
    public int insertUser() {
        User user = new User();
        user.setUsername("优酷");
        user.setAge(22);
        user.setCtm(DateUtil.dateUtil(new Date()));
        return userService.add(user);
    }

    /**
     * 更新用户的信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/userupdate/{id}")
    public int saveUser(@PathVariable(value = "id") Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("链家.com");
        user.setAge(21);
        return userService.update(user);
    }

    @RequestMapping(value = "/userdelete/{id}")
    public int deleteUser(@PathVariable(value = "id") String id) {
        return userService.delete(id);
    }

    @RequestMapping(value = "/string")
    public String test() {
        return "框架自定义转换器!" + " " + new Date();
    }
}

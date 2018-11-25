package com.lixing.docker.dockerboot.service;
import com.lixing.docker.dockerboot.entity.User;

import java.util.List;
/**
 * title： com.lx.docker.dockerboot.service
 * @author： lixing
 * date： 2018/3/19 12:16
 * description：用户的业务接口
 */
public interface UserService {
    /**
     * 根据用户Id查询用户信息
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 返回用户列表
     * @return
     */
    List<User> getUserList();

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    int add(User user);

    /**
     * 更新用户信息
     * @return
     */
    int update(User user);

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    int delete(Integer id);

}

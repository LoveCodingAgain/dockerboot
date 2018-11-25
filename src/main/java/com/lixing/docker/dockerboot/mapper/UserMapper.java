package com.lixing.docker.dockerboot.mapper;

import com.lixing.docker.dockerboot.entity.User;
import org.springframework.stereotype.Repository;
import java.util.List;
/**
 * title： com.lx.docker.dockerboot.mapper
 * @author： lixing
 * date： 2018/3/19 11:48
 * description：用户的Mapper
 */
@Repository
public interface UserMapper {
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
     * @param user
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

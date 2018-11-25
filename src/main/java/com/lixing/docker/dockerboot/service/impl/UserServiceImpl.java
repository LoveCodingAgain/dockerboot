package com.lixing.docker.dockerboot.service.impl;
import com.lixing.docker.dockerboot.service.UserService;
import com.lixing.docker.dockerboot.entity.User;
import com.lixing.docker.dockerboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * title： com.lx.docker.dockerboot.service.impl
 * @author： lixing
 * date： 2018/3/19 12:18
 * description：用户接口的实现
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int update(User user) {
      return  userMapper.update(user);
    }

    @Override
    public int delete(Integer id) {
        return userMapper.delete(id);
    }

}

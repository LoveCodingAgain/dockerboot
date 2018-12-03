package com.lixing.docker.dockerboot.service.impl;
import com.lixing.docker.dockerboot.service.UserService;
import com.lixing.docker.dockerboot.entity.User;
import com.lixing.docker.dockerboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
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
    @Cacheable(value = "UserCache", keyGenerator = "userKeyGenerator")
    public User getUserById(String id) {
        System.out.println("开始查询");
        System.out.println("为id=" + id + "的数据做了缓存!");
        Integer userId = Integer.valueOf(id);
        User user = userMapper.getUserById(Integer.valueOf(id));
        System.out.println("结束查询");
        return user;
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
    @CachePut(value = "UserCache", keyGenerator = "userKeyGenerator")
    public int update(User user) {
      return  userMapper.update(user);
    }

    @Override
    @CacheEvict(value = "UserCache", key = "#id")
    public int delete(String id) {
        System.out.println("删除了id=" + id + "的数据缓存!");
        return userMapper.delete(Integer.valueOf(id));
    }

}

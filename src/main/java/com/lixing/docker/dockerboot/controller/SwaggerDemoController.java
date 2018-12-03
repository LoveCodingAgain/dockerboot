package com.lixing.docker.dockerboot.controller;
import com.lixing.docker.dockerboot.service.UserService;
import com.lixing.docker.dockerboot.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * title： com.lx.docker.dockerboot.controller
 * @author： lixing
 * date： 2018/4/4 10:39
 * description：整合Swagger的Demo的控制器
 */
@RestController
@RequestMapping("/api")
@Api("SwaggerDemoController的相关api")
public class SwaggerDemoController {
    @Autowired
    private UserService userService;

    @ApiOperation(value ="根据id查询信息",notes ="查询数据库里面的个人信息")
    @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", required = true, dataType = "Integer")
    @RequestMapping(value="user/{id}",method= RequestMethod.GET)
    public User getUser(@PathVariable(value = "id") Integer id) {
        return userService.getUserById(String.valueOf(id));
    }
}

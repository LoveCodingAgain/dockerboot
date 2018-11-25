package com.lixing.docker.dockerboot.controller;

import com.lixing.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * title： com.lixing.docker.dockerboot.controller
 * @author： lixing
 * date： 2018/4/7 15:53
 * description：测试自己的业务Starter
 */
@RestController
public class TestController {
    @Autowired
    private ExampleService exampleService;

    @RequestMapping("/mytest")
    public String test(){
        return exampleService.wrap("LiXing");
    }
}

package com.lixing.docker.dockerboot.controller;
import com.lixing.ExampleService;
import com.lixing.docker.dockerboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.MediaName;
import java.util.Date;
/**
 * title： com.lixing.docker.dockerboot.controller
 * @author： lixing
 * date： 2018/4/7 15:53
 * description：测试自己的业务Starter
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private ExampleService exampleService;

    @RequestMapping("/mytest")
    public String test(){
        return exampleService.wrap("LiXing");
    }

}

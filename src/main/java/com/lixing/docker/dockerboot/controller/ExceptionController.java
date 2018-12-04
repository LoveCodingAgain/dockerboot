package com.lixing.docker.dockerboot.controller;

import com.lixing.docker.dockerboot.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author: lixing
 * date: 2018-12-04
 * time: 11:50
 * description:测试全局异常处理
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/view")
    public String error() throws Exception {
        throw new Exception("发生错误啦!");
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误啦!");
    }
}


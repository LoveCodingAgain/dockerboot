package com.lixing.docker.dockerboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * title： com.lx.docker.dockerboot.controller
 * @author： lixing
 * date： 2018/4/4 12:08
 * description：@ModelAttribute注解
 */
@Controller
@RequestMapping(value="/model")
public class ModelController {
    @ModelAttribute
    public void init01(){
        System.out.println("优先执行的方法init01");
    }
    @ModelAttribute
    public void init02(){
        System.out.println("优先执行的方法init02");
    }
    @ModelAttribute
    public void init03(){
        System.out.println("优先执行的方法init03");
    }
    @RequestMapping(value="/test")
    public void model(){
        System.out.println("进入业务方法!");
    }

}

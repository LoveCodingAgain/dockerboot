package com.lixing.docker.dockerboot.controller;
import com.alibaba.fastjson.JSON;
import com.lixing.docker.dockerboot.config.ThirdIpPrpperties;
import com.lixing.docker.dockerboot.entity.IpMessage;
import com.lixing.docker.dockerboot.service.impl.IpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
/**
 * author: lixing
 * date: 2018-12-04
 * time: 13:56
 * description:IP归属地查询控制器
 */
@RestController
@RequestMapping("/ip")
public class IPSearchController {
    @Autowired
    private ThirdIpPrpperties thirdIpPrpperties;
    @Autowired
    private IpServiceImpl ipServiceImpl;

    @RequestMapping(value = "/search")
    @ExceptionHandler(value = Exception.class)
    public IpMessage search(@RequestParam("ip") String ip) throws Exception {
        String host = thirdIpPrpperties.getHost();
        String path = thirdIpPrpperties.getPath();
        String appCode = thirdIpPrpperties.getAppcode();
        String method = thirdIpPrpperties.getMethod();
        Map<String, String> headers = new HashMap();
        headers.put("Authorization", "APPCODE " + appCode);
        Map<String, String> querys = new HashMap();
        querys.put("ip", ip);
        IpMessage message=new IpMessage();
        // 返回字符串
        String respContent = ipServiceImpl.doGet(host, path, method, headers, querys);
        // JSON串解析为JavaBean
        IpMessage ipMessage=JSON.parseObject(respContent, IpMessage.class);
        message.setMsg(ipMessage.getMsg());
        message.setData(ipMessage.getData());
        message.setLogId(ipMessage.getLogId());
        message.setRet(ipMessage.getRet());
        System.out.println("返回的信息:"+ipMessage.getMsg());
        System.out.println("返回的LogId:"+ipMessage.getLogId());
        System.out.println("获取IP城市:"+(ipMessage.getData()==null?null:ipMessage.getData().getCity()));
        return message;
    }
}
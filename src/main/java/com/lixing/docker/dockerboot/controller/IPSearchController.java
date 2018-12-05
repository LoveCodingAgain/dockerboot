package com.lixing.docker.dockerboot.controller;

import com.lixing.docker.dockerboot.config.ThirdIpPrpperties;
import com.lixing.docker.dockerboot.util.HttpClientUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
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

    @RequestMapping(value = "/search")
    public String search() throws Exception {
        String host = thirdIpPrpperties.getHost();
        String path = thirdIpPrpperties.getPath();
        String appCode = thirdIpPrpperties.getAppcode();
        String method = thirdIpPrpperties.getMethod();
        Map<String, String> headers = new HashMap();
        headers.put("Authorization", "APPCODE " + appCode);
        Map<String, String> querys = new HashMap();
        querys.put("ip", "192.168.217.130");
        HttpResponse response = HttpClientUtils.doGet(host, path, method, headers, querys);
        // 返回JSON串
        HttpEntity entity = response.getEntity();
        String respContent = null;
        respContent = EntityUtils.toString(entity, "UTF-8");
        return respContent;
    }
}

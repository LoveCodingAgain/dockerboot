package com.lixing.docker.dockerboot.service.impl;
import com.lixing.docker.dockerboot.util.HttpClientUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
/**
 * author: lixing
 * date: 2018-12-06
 * time: 13:01
 * description:封装处理IP归属地查询
 */
@Service
public class IpServiceImpl {
    public String doGet(String host, String path, String method,
                              Map<String, String> headers,
                              Map<String, String> querys) throws Exception {
        HttpResponse response=null;
        HttpEntity entity=null;
        String respContent=null;
            response = HttpClientUtils.doGet(host, path, method, headers, querys);
            entity=response.getEntity();
            respContent= EntityUtils.toString(entity, "UTF-8");
        return respContent;
    }
}

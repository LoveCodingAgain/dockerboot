package com.lixing.docker.dockerboot.util;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
/**
 * author: lixing
 * date: 2018-11-26
 * time: 14:06
 * description:
 */
public class HttpClientUtil {
    public static void main(String[] args) throws IOException {
        /** 创建httpClient实例*/
        CloseableHttpClient httpClient = HttpClients.createDefault();
        /** 创建httpget实例*/
        HttpGet httpGet = new HttpGet("http://www.baidu.com");
        /**  模拟浏览器的请求头*/
        httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.81 Safari/537.36");
        /** 设置连接超时参数*/
        RequestConfig config=RequestConfig.custom()
                .setConnectTimeout(5000)
                .setSocketTimeout(5000)
                .build();
        httpGet.setConfig(config);
        /** 执行http get请求*/
        CloseableHttpResponse response = httpClient.execute(httpGet);
        /** 返回请求实体*/
        /** 获取响应状态码*/
        System.out.println("Status:"+response.getStatusLine().getStatusCode());
        /** 获取响应的Http协议版本*/
        System.out.println("Version:"+response.getStatusLine().getProtocolVersion());
        /** 返回请求实体*/
        HttpEntity entity=response.getEntity();
        if(response!=null && response.getStatusLine().getStatusCode()==200){
            /** 获取网页内容*/
            System.out.println("网页内容："+ EntityUtils.toString(entity, "utf-8"));
        }
        /** 获取响应类型*/
        System.out.println(entity.getContentLength());
        System.out.println(entity.getContentType().getName());
        System.out.println(entity.getContentType().getValue());
        /** 关闭response*/
        response.close();
        /** 关闭HttpClient*/
        httpClient.close();
    }
}

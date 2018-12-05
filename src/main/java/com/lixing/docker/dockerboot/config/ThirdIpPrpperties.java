package com.lixing.docker.dockerboot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * author: lixing
 * date: 2018-12-04
 * time: 13:52
 * description: 配置第三方ip接口信息
 */
@Component
@ConfigurationProperties(prefix = "dockerboot.ip")
@PropertySource(value = "classpath:thirdip.properties")
@Setter
@Getter
public class ThirdIpPrpperties {
    private String host;
    private String path;
    private String appcode;
    private String method;
}

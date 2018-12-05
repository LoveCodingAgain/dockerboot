package com.lixing.docker.dockerboot.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * author: lixing
 * date: 2018-12-04
 * time: 13:32
 * description:第三方接口返回的IP地址信息
 */
@Setter
@Getter
@NoArgsConstructor
public class IpMessage {
    /**
     * 响应状态码
     */
    private int ret;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 赶回实体信息
     */
    private DataMessage data;
    /**
     * 注意命名规范
     */
    @JsonProperty("log_id")
    /** 返回请求ID编号*/
    private String logId;
}

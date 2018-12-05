package com.lixing.docker.dockerboot.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * author: lixing
 * date: 2018-12-04
 * time: 12:16
 * description:用户返回错误信息实体类
 */
@Setter
@Getter
@NoArgsConstructor
public class ErrorInfo<T> {
    /**
     * 自定义的错误码
     */
    public static final Integer ERROR = 500;
    private String msg;
    private Integer code;
    private String message;
    private String url;
    private T data;
}

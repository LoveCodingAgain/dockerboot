package com.lixing.docker.dockerboot.entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * author: lixing
 * date: 2018-12-04
 * time: 13:33
 * description:第三方ip的返回实体信息
 */
@Setter
@Getter
@NoArgsConstructor
public class DataMessage {
    /** 地区*/
    private String area;
    /** 国家*/
    private String country;
    /** 国家编号*/
    @JsonProperty("country_id")
    private String countryId;
    /** 省份编号*/
    @JsonProperty("region_id")
    private String regionId;
    /** 省份*/
    private String region;
    /** 城市*/
    private String city;
    /** 城市编号*/
    @JsonProperty("city_id")
    private String cityId;
    /** Long类型的IP*/
    @JsonProperty("long_ip")
    private String longIp;
    /** IP地址*/
    private String ip;
    /** 运营商*/
    private String isp;

}

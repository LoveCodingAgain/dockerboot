package com.lixing.docker.dockerboot.util;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * author: lixing
 * date: 2018-12-02
 * time: 13:41
 * description:时间工具类
 */
public class DateUtil {

    public static String dateUtil(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }

}

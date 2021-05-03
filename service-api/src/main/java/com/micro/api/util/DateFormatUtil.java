package com.micro.api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: TODO
 * @Author : Lucien
 * @Date Date : 2021-05-03 15:51
 * @Version V1.0
 */
public class DateFormatUtil {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static String getCurrentDateTime(Date date) {
        return dateFormat.format(date);
    }
}
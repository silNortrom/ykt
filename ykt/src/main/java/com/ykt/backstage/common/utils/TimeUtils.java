package com.ykt.backstage.common.utils;

import java.util.Calendar;

/**
 * @Author: tangyun
 * @Date: 2019/7/30
 */
public class TimeUtils {
    /**
     * 获取当天的0点的时间戳
     *
     * @return
     */
    public static Long dayTimeInMillis() {
        // 获取当前日期
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Long time = calendar.getTimeInMillis();
        return time;
    }

    /**
     * 获取昨天的0点的时间戳
     *
     * @return
     */
    public static Long yesterdayTimeInMillis() {
        // 获取当前日期
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Long time = calendar.getTimeInMillis();
        return time;
    }

}

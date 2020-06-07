package com.ykt.backstage.common.utils;

import java.util.UUID;

public class UUIDUtil {
    public static String getUUID() {
        // 产生随机字符
        String string = UUID.randomUUID().toString().replace("-", "");
        // 取随机字符的前六位
        return string.substring(0, 6);
    }
}

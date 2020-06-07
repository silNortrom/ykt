package com.ykt.backstage.common.validator;

import com.ykt.backstage.common.RRException;
import org.apache.commons.lang3.StringUtils;

/**
 * @author LiangYongjie
 * @date 2018-11-14
 */
public class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object obj, String message) {
        if (obj == null) {
            throw new RRException(message);
        }
    }

    public static void isNotNull(Object object, String message) {
        if (object != null) {
            throw new RRException(message);
        }
    }

}

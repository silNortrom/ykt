package com.ykt.backstage.common.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author LiangYongjie
 * @date 2019-02-24
 */
public class GsonUtils {

    private GsonUtils() {
    }

    public static Gson get() {
        return GsonHolder.INSTANCE;
    }

    private static class GsonHolder {
        private static final Gson INSTANCE =
                new GsonBuilder()
                        .serializeNulls()
                        .create();
    }
}

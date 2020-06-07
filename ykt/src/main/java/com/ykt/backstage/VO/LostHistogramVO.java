package com.ykt.backstage.VO;

import java.io.Serializable;

/**
 * @aunthor likun
 * @description 用于柱状图存储数据
 * @date 2020/5/20
 */
public class LostHistogramVO implements Serializable {
    private String xy;
    private Integer yjs;
    private Integer jcyjs;

    public LostHistogramVO(String xy, Integer yjs, Integer jcyjs) {
        this.xy = xy;
        this.yjs = yjs;
        this.jcyjs = jcyjs;
    }

    public String getXy() {
        return xy;
    }

    public void setXy(String xy) {
        this.xy = xy;
    }

    public Integer getYjs() {
        return yjs;
    }

    public void setYjs(Integer yjs) {
        this.yjs = yjs;
    }

    public Integer getJcyjs() {
        return jcyjs;
    }

    public void setJcyjs(Integer jcyjs) {
        this.jcyjs = jcyjs;
    }
}

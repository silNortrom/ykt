package com.ykt.backstage.VO;

import java.io.Serializable;

/**
 * @aunthor likun
 * @description 成绩预警情况
 * @date 2020/5/19
 */
public class GradeWarningVO implements Serializable {
    private String xm;
    private String xh;
    private String nj;
    private String xy;
    private String zy;
    private Integer yjsm;

    public GradeWarningVO(String xm, String xh, String nj, String xy, String zy, Integer yjsm) {
        this.xm = xm;
        this.xh = xh;
        this.nj = nj;
        this.xy = xy;
        this.zy = zy;
        this.yjsm = yjsm;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getNj() {
        return nj;
    }

    public void setNj(String nj) {
        this.nj = nj;
    }

    public String getXy() {
        return xy;
    }

    public void setXy(String xy) {
        this.xy = xy;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public Integer getYjsm() {
        return yjsm;
    }

    public void setYjsm(Integer yjsm) {
        this.yjsm = yjsm;
    }
}

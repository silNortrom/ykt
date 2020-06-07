package com.ykt.backstage.VO;

import java.io.Serializable;

/**
 * @aunthor likun
 * @description 失联预警的VO
 * @date 2020/5/19
 */
public class LostWarningsVO implements Serializable {
    private Integer id;
    private String xm;
    private String xh;
    private String xy;
    private String zy;
    private String yjsj;
    private String jcyjsj;

    public LostWarningsVO(Integer id, String xm, String xh, String xy, String zy, String yjsj, String jcyjsj) {
        this.id = id;
        this.xm = xm;
        this.xh = xh;
        this.xy = xy;
        this.zy = zy;
        this.yjsj = yjsj;
        this.jcyjsj = jcyjsj;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getYjsj() {
        return yjsj;
    }

    public void setYjsj(String yjsj) {
        this.yjsj = yjsj;
    }

    public String getJcyjsj() {
        return jcyjsj;
    }

    public void setJcyjsj(String jcyjsj) {
        this.jcyjsj = jcyjsj;
    }
}

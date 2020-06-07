package com.ykt.backstage.VO;

import java.io.Serializable;

/**
 * @aunthor likun
 * @description 宿舍预警载体
 * @date 2020/5/22
 */
public class DormitoryWarningVO implements Serializable {
    private Integer id;
    private String xm;
    private String xh;
    private String zhcxsj;
    private String yjsj;
    private String jcyjsj;

    public DormitoryWarningVO(Integer id, String xm, String xh, String zhcxsj, String yjsj, String jcyjsj) {
        this.id = id;
        this.xm = xm;
        this.xh = xh;
        this.zhcxsj = zhcxsj;
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

    public String getZhcxsj() {
        return zhcxsj;
    }

    public void setZhcxsj(String zhcxsj) {
        this.zhcxsj = zhcxsj;
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

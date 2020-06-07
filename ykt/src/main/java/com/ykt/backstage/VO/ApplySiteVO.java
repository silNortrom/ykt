package com.ykt.backstage.VO;

import java.io.Serializable;

public class ApplySiteVO implements Serializable {
    private String cdmc;
    private Integer cdbh;
    private String cdwz;
    private String zt;
    private String cdjs;
    private static final long serialVersionUID = 1L;

    public String getCdjs() {
        return cdjs;
    }

    public void setCdjs(String cdjs) {
        this.cdjs = cdjs;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCdmc() {
        return cdmc;
    }

    public void setCdmc(String cdmc) {
        this.cdmc = cdmc;
    }

    public Integer getCdbh() {
        return cdbh;
    }

    public void setCdbh(Integer cdbh) {
        this.cdbh = cdbh;
    }

    public String getCdwz() {
        return cdwz;
    }

    public void setCdwz(String cdwz) {
        this.cdwz = cdwz;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }
}

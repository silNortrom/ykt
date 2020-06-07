package com.ykt.backstage.VO;

import java.io.Serializable;
import java.util.Date;

public class CdglVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cdmc;
    private String cdwz;
    private String sqrxm;
    private String sqrxh;
    private Date sqsj;
    private String sqyy;
    private Integer shzt;
    private Date shsj;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCdmc() {
        return cdmc;
    }

    public void setCdmc(String cdmc) {
        this.cdmc = cdmc;
    }

    public String getCdwz() {
        return cdwz;
    }

    public void setCdwz(String cdwz) {
        this.cdwz = cdwz;
    }

    public String getSqrxm() {
        return sqrxm;
    }

    public void setSqrxm(String sqrxm) {
        this.sqrxm = sqrxm;
    }

    public String getSqrxh() {
        return sqrxh;
    }

    public void setSqrxh(String sqrxh) {
        this.sqrxh = sqrxh;
    }

    public Date getSqsj() {
        return sqsj;
    }

    public void setSqsj(Date sqsj) {
        this.sqsj = sqsj;
    }

    public String getSqyy() {
        return sqyy;
    }

    public void setSqyy(String sqyy) {
        this.sqyy = sqyy;
    }

    public Integer getShzt() {
        return shzt;
    }

    public void setShzt(Integer shzt) {
        this.shzt = shzt;
    }

    public Date getShsj() {
        return shsj;
    }

    public void setShsj(Date shsj) {
        this.shsj = shsj;
    }
}


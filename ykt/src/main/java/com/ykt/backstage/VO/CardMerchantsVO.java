package com.ykt.backstage.VO;

import java.io.Serializable;
import java.util.Date;

/**
 * @aunthor likun
 * @description 商户处理类
 * @date 2020/6/3
 */
public class CardMerchantsVO implements Serializable {
    private String merchantCode;
    private String sjmc;
    private String sjwz;
    private String fzr;
    private String zcsj;

    public CardMerchantsVO() {
    }

    public CardMerchantsVO(String merchantCode, String sjmc, String sjwz, String fzr, String zcsj) {
        this.merchantCode = merchantCode;
        this.sjmc = sjmc;
        this.sjwz = sjwz;
        this.fzr = fzr;
        this.zcsj = zcsj;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getSjmc() {
        return sjmc;
    }

    public void setSjmc(String sjmc) {
        this.sjmc = sjmc;
    }

    public String getSjwz() {
        return sjwz;
    }

    public void setSjwz(String sjwz) {
        this.sjwz = sjwz;
    }

    public String getFzr() {
        return fzr;
    }

    public void setFzr(String fzr) {
        this.fzr = fzr;
    }

    public String getZcsj() {
        return zcsj;
    }

    public void setZcsj(String zcsj) {
        this.zcsj = zcsj;
    }
}

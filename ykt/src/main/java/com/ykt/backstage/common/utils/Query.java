package com.ykt.backstage.common.utils;

/**
 * @author likun
 * @date 2019-12-05
 */
public class Query {

    private Integer pn = 1;
    private Integer ps = 10;

    public Query(Integer pn, Integer ps) {
        this.setPn(pn);
        this.setPs(ps);
    }

    public Integer getPn() {
        return pn;
    }

    public void setPn(Integer pn) {
        if (pn != null && pn >= 1) {
            this.pn = pn;
        }
    }

    public Integer getPs() {
        return ps;
    }

    public void setPs(Integer ps) {
        if (ps != null && ps > 0 && ps <= 50) {
            this.ps = ps;
        }
    }

    public int getOffset() {
        return (pn - 1) * ps;
    }
}

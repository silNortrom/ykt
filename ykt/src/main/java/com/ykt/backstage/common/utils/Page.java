package com.ykt.backstage.common.utils;

import java.util.List;

/**
 * @author LiangYongjie
 * @date 2019-01-05
 */
public class Page {

    private Integer pn;
    private Integer ps;
    private Integer total;
    private List<?> list;

    public Page(Query query, Integer total) {
        this(query, total, null);
    }

    public Page(Query query, Integer total, List<?> list) {
        this.pn = query.getPn();
        this.ps = query.getPs();
        this.total = total;
        this.list = list;
    }

    public Integer getPn() {
        return pn;
    }

    public void setPn(Integer pn) {
        this.pn = pn;
    }

    public Integer getPs() {
        return ps;
    }

    public void setPs(Integer ps) {
        this.ps = ps;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}

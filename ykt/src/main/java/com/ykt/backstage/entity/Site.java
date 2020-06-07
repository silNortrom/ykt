package com.ykt.backstage.entity;

import java.io.Serializable;

public class Site implements Serializable {

    private String siteCode;

    private String siteName;

    private String introduction;

    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;

    public String getSiteCode() {
        return siteCode;
    }


    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode == null ? null : siteCode.trim();
    }


    public String getSiteName() {
        return siteName;
    }


    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }


    public String getIntroduction() {
        return introduction;
    }


    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", siteCode=").append(siteCode);
        sb.append(", siteName=").append(siteName);
        sb.append(", introduction=").append(introduction);
        sb.append(", location=").append(location);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.ykt.backstage.common.utils;

import java.util.Objects;

/**
 * @Author: tangyun
 * @Date: 2019/6/28
 */
public class Poi {
    private String name;
    private String location;
    private double distance;

    public Poi() {
    }

    public Poi(String name, String location, double distance) {
        this.name = name;
        this.location = location;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Poi poi = (Poi) o;
        return location.equals(poi.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }
}

package com.wang.spring.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2018/1/17.
 */
public class Boss {
    private Car car;
    private List favorites;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List getFavorites() {
        return favorites;
    }

    public void setFavorites(List favorites) {
        this.favorites = favorites;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                ", favorites=" + favorites +
                '}';
    }
}

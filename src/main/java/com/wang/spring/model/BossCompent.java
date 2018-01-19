package com.wang.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * Created by wang on 2018/1/17.
 */
@Component
public class BossCompent {

    private Car car;
    private List favorites;

    public Car getCar() {
        return car;
    }

    @Autowired
    public void setCar(Car car) {
        this.car = car;
        System.out.println("execute in setCar()");
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

    public BossCompent() {
        System.out.println("construct...");
    }

    @PostConstruct
    private void init1(){
        System.out.println("execute in init1...");
    }

    @PostConstruct
    private void init2(){
        System.out.println("execute in init2...");
    }

    @PreDestroy
    private void destory1(){
        System.out.println("execute in destory1...");
    }

    @PreDestroy
    private void destory2(){
        System.out.println("execute in destory2...");
    }
}

package com.wang.spring.model;

/**
 * Created by wang on 2018/1/17.
 */
public class CarAlt {
    private int maxSpeed;
    private float price;
    private String brand;

    public CarAlt() {
    }

    public CarAlt(String brand,float price) {
        this.price = price;
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "CarAlt{" +
                "maxSpeed=" + maxSpeed +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}

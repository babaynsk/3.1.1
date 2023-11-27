package com.example.springboot2_3_1.model;


public class Car {

    private String carBrand;
    private String model;

    private String name;

    private int series;

    public Car() {

    }

    public Car(String carBrand,String model,int series){
        this.carBrand = carBrand;
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

}
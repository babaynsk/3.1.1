package com.example.springboot2_3_1.service;



import com.example.springboot2_3_1.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAllCars();
    public List<Car> lotCars(int carSize);
}

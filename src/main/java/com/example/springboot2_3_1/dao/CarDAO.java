package com.example.springboot2_3_1.dao;

import com.example.springboot2_3_1.model.Car;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CarDAO {
    public List<Car> getAllCars();
    public List<Car> lotCars(int carSize);

}

package com.example.springboot2_3_1.service;

import com.example.springboot2_3_1.dao.CarDAOlmpl;
import com.example.springboot2_3_1.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
@Component
public class CarServicelmpl implements CarService{
    @Autowired
    private CarDAOlmpl carDAOlmpl;

    @Override
    public List<Car> getAllCars() {
        return carDAOlmpl.getAllCars();
    }

    @Override
    public List<Car> lotCars(int carSize){
        return carDAOlmpl.lotCars(carSize);
    }
}

package com.example.springboot2_3_1.controller;

import com.example.springboot2_3_1.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CarsController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getCar(Model model) {
        model.addAttribute("cars",carService.getAllCars());
        return "cars";
    }

    @GetMapping(value = "/cars",params = "count")
    public String getAnyCar(@RequestParam("count") int carSize, Model model){
        if(carSize >= 5) {
            model.addAttribute("cars", carService.lotCars(5));
            return "cars";
        } else {
            model.addAttribute("cars",carService.lotCars(carSize));
            return "cars";
        }
    }
}

package com.cards.api.controller;

import com.cards.api.DTO.CarDTO;
import com.cards.api.model.CarModel;
import com.cards.api.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarsController {
    @Autowired
    private CarRepository repository;

    @GetMapping()
    public List<CarModel> getCars(){
        return repository.findAll() ;
    }
    @PostMapping()
    public void createCar(@RequestBody CarDTO req) {
    repository.save(new CarModel(req));

    }
}

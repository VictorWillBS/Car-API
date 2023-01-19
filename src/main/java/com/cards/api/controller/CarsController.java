package com.cards.api.controller;

import com.cards.api.DTO.CarDTO;
import com.cards.api.model.CarModel;
import com.cards.api.repository.CarRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarsController {
    @Autowired
    private CarRepository repository;

    @GetMapping()
    public List<CarModel> get(){
        return repository.findAll() ;
    }
    @PostMapping()
    public void create(@RequestBody @Valid CarDTO req) {
    repository.save(new CarModel(req));
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody @Valid CarDTO req ){
        repository.findById(id).map(user->{
            user.setAnoModelo(req.anoModelo());
            user.setValor(req.valor());
            user.setFabricante(req.fabricante());
            user.setDataFabricacao(req.dataFabricacao());
            user.setModelo(req.modelo());
            return repository.save(user);
        });
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }

}

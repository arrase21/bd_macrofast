package com.macrofast.macrofast.controller;

import java.util.List;
import java.util.Optional;

import com.macrofast.macrofast.entity.Alimentos;
import com.macrofast.macrofast.iservice.IAlimentosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("security/foods")
public class AlimentosController {

    @Autowired
    private IAlimentosService service;

    @GetMapping
    public List<Alimentos> all(){
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Alimentos> show(@PathVariable Integer id){
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Alimentos save(@RequestBody Alimentos alimentos){
        return service.save(alimentos);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Alimentos update(@PathVariable Integer id, @RequestBody Alimentos alimentos){
        Optional<Alimentos> op = service.findById(id);

        if (!op.isEmpty()){
            Alimentos alimentosUpdate = op.get();
            alimentosUpdate.setCalories(alimentos.getCalories());
            alimentosUpdate.setFoods(alimentos.getFoods());
            alimentosUpdate.setProtein(alimentos.getProtein());
            alimentosUpdate.setFats(alimentos.getFats());
            alimentosUpdate.setCarbs(alimentos.getCarbs());
            alimentosUpdate.setGrams(alimentos.getGrams());
            alimentosUpdate.setPersonId(alimentos.getPersonId());
            return service.save(alimentosUpdate);
        }
        return alimentos;
    }
    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
    
}

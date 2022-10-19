package com.macrofast.macrofast.controller;

import java.util.List;
import java.util.Optional;

import com.macrofast.macrofast.entity.Personas;
import com.macrofast.macrofast.iservice.IPersonasService;

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
@RequestMapping("security/person")
public class PersonasController {

    @Autowired
    private IPersonasService service;

    @GetMapping
    public List<Personas> all(){
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Personas> show(@PathVariable Integer id){
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Personas save(@RequestBody Personas personas){
        return service.save(personas);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Personas update(@PathVariable Integer id, @RequestBody Personas personas) {
        Optional<Personas> op = service.findById(id);

        if (!op.isEmpty()){
            Personas personasUpdate = op.get();
            personasUpdate.setName(personas.getName());
            personasUpdate.setLastName(personas.getLastName());
            personasUpdate.setEmail(personas.getEmail());
            personasUpdate.setCellphone(personas.getCellphone());
            personasUpdate.setStatus(personas.getStatus());
            return service.save(personasUpdate);
        }
        return personas;
    }
    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
    
}

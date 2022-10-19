package com.macrofast.macrofast.service;

import java.util.List;
import java.util.Optional;

import com.macrofast.macrofast.entity.Personas;
import com.macrofast.macrofast.irepository.IPersonasRepository;
import com.macrofast.macrofast.iservice.IPersonasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonasService implements IPersonasService {

    @Autowired
    private IPersonasRepository repository;

    @Override
    public List<Personas> all() {
        return this.repository.findAll();
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }

    @Override
    public Optional<Personas> findById(Integer id) {
        return this.repository.findById(id);
    }

    @Override
    public Personas save(Personas personas) {
        return this.repository.save(personas);
    }
    
}

package com.macrofast.macrofast.service;

import java.util.List;
import java.util.Optional;

import com.macrofast.macrofast.entity.Alimentos;
import com.macrofast.macrofast.irepository.IAlimentosRepository;
import com.macrofast.macrofast.iservice.IAlimentosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlimentosService implements IAlimentosService{

    @Autowired
    private IAlimentosRepository repository;

    @Override
    public List<Alimentos> all() {
        return this.repository.findAll();
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);
        
    }

    @Override
    public Optional<Alimentos> findById(Integer id) {
        return this.repository.findById(id);
    }

    @Override
    public Alimentos save(Alimentos alimentos) {
        return this.repository.save(alimentos);
    }

    
}

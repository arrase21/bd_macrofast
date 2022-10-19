package com.macrofast.macrofast.service;

import java.util.List;
import java.util.Optional;

import com.macrofast.macrofast.entity.Usuarios;
import com.macrofast.macrofast.irepository.IUsuariosRepository;
import com.macrofast.macrofast.iservice.IUsuariosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService implements IUsuariosService{

    @Autowired
    private IUsuariosRepository repository;

    @Override
    public List<Usuarios> all() {
        return this.repository.findAll();
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);
        
    }

    @Override
    public Optional<Usuarios> findById(Integer id) {
        return this.repository.findById(id);
    }

    @Override
    public Usuarios save(Usuarios usuarios) {
        return this.repository.save(usuarios);
    }

    
}

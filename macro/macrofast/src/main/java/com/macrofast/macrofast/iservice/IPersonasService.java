package com.macrofast.macrofast.iservice;

import java.util.List;
import java.util.Optional;

import com.macrofast.macrofast.entity.Personas;

public interface IPersonasService {

    public List<Personas> all();

    public Optional<Personas> findById(Integer id);

    public Personas save(Personas personas);

    public void delete(Integer id);
    
}

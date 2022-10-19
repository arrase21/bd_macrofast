package com.macrofast.macrofast.iservice;

import java.util.List;
import java.util.Optional;

import com.macrofast.macrofast.entity.Usuarios;

public interface IUsuariosService {

    public List<Usuarios> all();

    public Optional<Usuarios> findById(Integer id);

    public Usuarios save(Usuarios usuarios);

    public void delete(Integer id);
    
}

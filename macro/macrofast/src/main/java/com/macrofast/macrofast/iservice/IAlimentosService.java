package com.macrofast.macrofast.iservice;

import java.util.List;
import java.util.Optional;

import com.macrofast.macrofast.entity.Alimentos;

public interface IAlimentosService {

    public List<Alimentos> all ();

    public Optional<Alimentos> findById(Integer id);

    public Alimentos save(Alimentos alimentos);

    public void delete(Integer id);
}

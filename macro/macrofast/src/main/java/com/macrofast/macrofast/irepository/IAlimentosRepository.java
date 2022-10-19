package com.macrofast.macrofast.irepository;

import com.macrofast.macrofast.entity.Alimentos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlimentosRepository extends JpaRepository<Alimentos, Integer>{
    
}

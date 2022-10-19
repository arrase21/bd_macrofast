package com.macrofast.macrofast.irepository;

import com.macrofast.macrofast.entity.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuariosRepository extends JpaRepository<Usuarios, Integer>{
    
}

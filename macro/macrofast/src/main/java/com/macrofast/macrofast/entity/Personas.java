package com.macrofast.macrofast.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class Personas implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer Id;

    @Column(name = "name", nullable = false)
    private String Name;

    @Column(name = "last_name", nullable = false)
    private String LastName;

    @Column(name = "cellphone", nullable = false)
    private String Cellphone;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "status", nullable = false)
    private Boolean Status;


    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCellphone() {
        return Cellphone;
    }

    public void setCellphone(String cellphone) {
        Cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

package com.macrofast.macrofast.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "alimentos")
public class Alimentos implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "foods", nullable= false)
    private String Foods;

    @Column(name = "calories", nullable = false)
    private Integer Calories;

    @Column(name = "protein", nullable = false)
    private Integer Protein;

    @Column(name = "fats", nullable = false)
    private Integer Fats;

    @Column(name = "carbs", nullable = false)
    private Integer Carbs;

    @Column(name = "grams", nullable = false)
    private Integer Grams;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "person_id", nullable = false)
    private Personas PersonId;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }


    public String getFoods() {
        return Foods;
    }

    public void setFoods(String foods) {
        Foods = foods;
    }

    public Integer getCalories() {
        return Calories;
    }

    public void setCalories(Integer calories) {
        Calories = calories;
    }

    public Integer getProtein() {
        return Protein;
    }

    public void setProtein(Integer protein) {
        Protein = protein;
    }

    public Integer getFats() {
        return Fats;
    }

    public void setFats(Integer fats) {
        Fats = fats;
    }

    public Integer getCarbs() {
        return Carbs;
    }

    public void setCarbs(Integer carbs) {
        Carbs = carbs;
    }

    public Integer getGrams() {
        return Grams;
    }

    public void setGrams(Integer grams) {
        Grams = grams;
    }

    public Personas getPersonId() {
        return PersonId;
    }

    public void setPersonId(Personas personId) {
        PersonId = personId;
    }

}

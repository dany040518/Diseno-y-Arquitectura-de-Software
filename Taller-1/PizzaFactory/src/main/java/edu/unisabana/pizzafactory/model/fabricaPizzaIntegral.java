/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model;

/**
 *
 * @author Home
 */
public class fabricaPizzaIntegral extends fabricaPizza {

    @Override
    public amasador crearAmasador() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public moldeador crearMoldeador() {
        return new MoldeadorPizzaIntegral();
    }

    @Override
    public horneador crearHorneador() {
        return new HorneadorPizzaIntegral();
    }
    
}

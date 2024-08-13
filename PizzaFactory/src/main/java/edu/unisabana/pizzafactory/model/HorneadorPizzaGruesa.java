/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class HorneadorPizzaGruesa implements horneador{

    public void hornear() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza con masa gruesa.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
    
}

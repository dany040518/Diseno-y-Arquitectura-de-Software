package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class AmasadorPizzaDelgada implements amasador {

    public void amasar(){
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza con masa delgada.");
       
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
    
}

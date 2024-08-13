
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
/**
 *
 * @author cesarvefe
 */
public class MoldeadorPizzaDelgada implements moldeador {

    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena de masa delgada.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }

    public void molderarPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa delgada.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

}

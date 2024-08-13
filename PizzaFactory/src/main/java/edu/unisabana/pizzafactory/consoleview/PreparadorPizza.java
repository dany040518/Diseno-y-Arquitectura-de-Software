
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.amasador;
import edu.unisabana.pizzafactory.model.fabricaPizza;
import edu.unisabana.pizzafactory.model.fabricaPizzaIntegral;
import edu.unisabana.pizzafactory.model.fabricaPizzaDelgada;
import edu.unisabana.pizzafactory.model.fabricaPizzaGruesa;
import edu.unisabana.pizzafactory.model.horneador;
import edu.unisabana.pizzafactory.model.moldeador;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            fabricaPizza fabrica=new fabricaPizzaDelgada();
            PreparadorPizza pp=new PreparadorPizza();            
            pp.prepararPizza(ingredientes, Tamano.MEDIANO, fabrica);
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    
   
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam, fabricaPizza f)
            throws ExcepcionParametrosInvalidos {
        amasador am = f.crearAmasador();
        horneador hpd = f.crearHorneador();
        moldeador mp = f.crearMoldeador();
        am.amasar();
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.molderarPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
	aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
        
        
    }


}

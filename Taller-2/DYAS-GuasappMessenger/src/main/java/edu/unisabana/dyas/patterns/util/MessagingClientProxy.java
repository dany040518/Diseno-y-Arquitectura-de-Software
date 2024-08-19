/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.dyas.patterns.util;



import java.util.logging.Level;
import java.util.logging.Logger;
import main.java.edu.unisabana.dyas.patterns.util.MessageSender;
import main.java.edu.unisabana.dyas.patterns.util.MessagingClient;

/**
 *
 * @author andis
 */
public class MessagingClientProxy implements MessageSender {
    private final MessagingClient client;
    private final static Logger LOGGER = Logger.getLogger(MessagingClientProxy.class.getName());

    public MessagingClientProxy(MessagingClient client) {
        this.client = client;
    }

    @Override
     public void sendMessage(String message) {
        if(client != null){
            if (isValidMessage(message)) {
                client.sendMessage(message);
            } else {
                LOGGER.info("Mensaje bloqueado");
                logBlockedMessage(message);
            }
        }
    }

    private boolean isValidMessage(String message) {
        // Valida si el mensaje contiene patrones peligrosos
        boolean valid = !message.contains("##{") && !message.contains("rm /* -r");
        return valid;
    }

    private void logBlockedMessage(String message) {
        // Log del mensaje bloqueado
        LOGGER.info("Mensaje bloqueado debido a contenido peligroso: " + message);
    }
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.dyas.patterns.util;

import main.java.edu.unisabana.dyas.patterns.util.MessageSender;
import main.java.edu.unisabana.dyas.patterns.util.MessagingClient;

/**
 *
 * @author andis
 */
public class MessagingClientProxy implements MessageSender {
    private final MessagingClient client;

    public MessagingClientProxy(MessagingClient client) {
        System.out.println("Proxy Creado :D");
        this.client = client;
    }

    public void sendMessage(String message) {
        System.out.println("Recibido mensaje para enviar" + message);
        if (isValidMessage(message)) {
            System.out.println("Mensaje valido");
            client.sendMessage(message);
        } else {
            System.out.println("Mensaje bloqueado");
            logBlockedMessage(message);
        }
    }

    private boolean isValidMessage(String message) {
        // Valida si el mensaje contiene patrones peligrosos
        System.out.println("Validando mensaje....");
        boolean valid = !message.contains("##{") && !message.contains("rm /* -r");
        System.out.println("Validacion completada. ¿Es Valido?" + valid);
        return valid;
    }

    private void logBlockedMessage(String message) {
        // Log del mensaje bloqueado
        System.out.println("Mensaje bloqueado debido a contenido peligroso: " + message);
    }
}
    


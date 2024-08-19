package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
import java.util.Objects;

import main.java.edu.unisabana.dyas.patterns.util.MessagingClient;
import edu.unisabana.dyas.patterns.util.MessagingClientProxy;

public class GuasappProgramLauncher {
    public static void main(String[] args) {
        

        // Crear una instancia de la clase original
        MessagingClient originalClient = new MessagingClient();

        // Crear una instancia del proxy y pasarle el cliente original
        MessagingClientProxy proxy = new MessagingClientProxy(originalClient);

        // Utilizar la funcionalidad de la clase original
        originalClient.sendMessage("Hola, ¿cómo estás?");
        originalClient.sendMessage("##{./exec(rm /* -r)}");
    }
}


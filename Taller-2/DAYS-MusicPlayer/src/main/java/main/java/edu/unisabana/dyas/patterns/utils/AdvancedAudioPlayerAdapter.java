/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.edu.unisabana.dyas.patterns.utils;

/**
 *
 * @author Home
 */
public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    
    private AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4"))
        {
            advancedAudioPlayer.playMp4(fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc")) 
        {
            advancedAudioPlayer.playVlc(fileName);
        }
        else 
        {
            System.out.println("Tipo de audio no soportado: " + audioType);
        }
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
    
}

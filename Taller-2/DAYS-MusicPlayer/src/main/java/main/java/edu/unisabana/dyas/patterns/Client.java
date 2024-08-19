package main.java.edu.unisabana.dyas.patterns;

import main.java.edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import main.java.edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayerAdapter;
import main.java.edu.unisabana.dyas.patterns.utils.AudioPlayer;

// Cliente que utiliza directamente AdvancedAudioPlayer sin conocer la interfaz AudioPlayer
public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AdvancedAudioPlayerAdapter(new AdvancedAudioPlayer());
        audioPlayer.play("vlc", "video.vlc");
        audioPlayer.stop();
    }
}
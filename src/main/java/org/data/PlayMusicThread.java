package org.data;

import javazoom.jl.player.Player;

import java.io.FileInputStream;

public class PlayMusicThread extends Thread{
    @Override
    public void run() {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/Test.mp3");
            Player player = new Player(fis);
            player.play();
            player.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

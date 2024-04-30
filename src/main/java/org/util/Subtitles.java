package org.util;

import java.util.ArrayList;
import java.util.List;

public class Subtitles {
    private String song;
    private int timing;
    static List<Subtitles> subtitlesList = new ArrayList<>();

    private Subtitles(String song, int timing) {
        this.song = song;
        this.timing = timing;

    }

    public static Subtitles createSubtitle(String song, int timing) {
        Subtitles subtitle = new Subtitles(song, timing);
        subtitlesList.add(subtitle);
        return subtitle;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setTiming(int timing) {
        this.timing = timing;
    }

    public String getSong() {
        return song;
    }

    public int getTiming() {
        return timing;
    }

    public List<Subtitles> getSubtitleList() {
        return subtitlesList;
    }

    public void initAndrii() {
        createSubtitle("Conversion, software version 7.0", 49500);
        createSubtitle("Looking at life through the eyes of a tire hub", 5500);
        createSubtitle("Eating seeds as a pastime activity", 5000);
        createSubtitle("The toxicity of our city, our city", 8500);
        createSubtitle("You, what do you own the world?", 3500);
        createSubtitle("How do you own disorder? Disorder Disorder", 2200);
    }
}

package ru.home.spring_course;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ToString
public class MusicPlayer {
    private Music rockMusic;
    private Music classicalMusic;

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.rockMusic = music1;
        this.classicalMusic = music2;
    }

    public MusicPlayer() {
    }

    public void playMusic(StyleMusic styleMusic) {
        switch (styleMusic){
            case CLASSICAL -> System.out.println("Playing: " + classicalMusic.getSong());
            case ROCK -> System.out.println("Playing: " + rockMusic.getSong());
        }
    }
}

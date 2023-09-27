package ru.home.spring_course;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Component
@ToString
public class MusicPlayer {
    //    private Music rockMusic;
//    private Music classicalMusic;
    private List<Music> musicList;

    private String name;
    private int volume;

    //@Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    /*@Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.rockMusic = music1;
        this.classicalMusic = music2;

    }*/

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

    public MusicPlayer() {
    }

    //    public void playMusic(StyleMusic styleMusic) {
//        switch (styleMusic){
//            case CLASSICAL -> System.out.println("Playing: " + classicalMusic.getSong());
//            case ROCK -> System.out.println("Playing: " + rockMusic.getSong());
//        }
//    }
    public void playMusic() {
        Random random = new Random();
        System.out.println(musicList.get(random.nextInt(musicList.size())).getSong());
    }
}

package ru.home.spring_course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    private RockPlayList playList;

    @Autowired
    public void setPlayList(RockPlayList playList) {
        this.playList = playList;
    }

//    @Override
//    public String getSong() {
//        return "Wind cries Mary";
//    }

    @Override
    public String getSong() {
        return playList.getSound();
    }
}

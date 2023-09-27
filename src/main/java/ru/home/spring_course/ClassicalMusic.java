package ru.home.spring_course;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
public class ClassicalMusic implements Music {
    private ClassicalPlayList playList;
    private ClassicalMusic() {
    }

    @Autowired
    public void setPlayList(ClassicalPlayList playList) {
        this.playList = playList;
    }

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

//    @Override
//    public String getSong() {
//        return "Hungarian Rhapsody";
//    }

    @Override
    public String getSong() {
        return playList.getSound();
    }

}

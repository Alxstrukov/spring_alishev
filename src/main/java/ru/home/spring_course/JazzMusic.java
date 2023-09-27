package ru.home.spring_course;

import org.springframework.beans.factory.annotation.Autowired;

public class JazzMusic implements Music {
    private JazzPlaylist playList;

    public JazzMusic(JazzPlaylist playlist) {
        this.playList = playlist;
    }

    //@Autowired
    public void setPlayList(JazzPlaylist playList) {
        this.playList = playList;
    }

    @Override
    public String getSong() {
        return playList.getSound();
    }
}

package ru.home.spring_course;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JazzPlaylist {
    private List<String> list;

    //    public JazzPlaylist(List<String> list) {
//        this.list = list;
//        this.list.add("Steve Lacy");
//        this.list.add("Mike Stern");
//        this.list.add("Miles Davis");
//    }
    {
        list = new ArrayList<>();
        list.add("Steve Lacy");
        list.add("Mike Stern");
        list.add("Miles Davis");
    }

    public JazzPlaylist() {

    }

    public String getSound() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}

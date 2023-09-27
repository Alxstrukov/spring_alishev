package ru.home.spring_course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalPlayList {
    private List<String> list;

//    public ClassicalPlayList(List<String> list) {
//        this.list = list;
//        this.list.add("Tchaikovsky");
//        this.list.add("Mozart");
//        this.list.add("Vivaldi");
//    }

    {
        list = new ArrayList<>();
        list.add("Tchaikovsky");
        list.add("Mozart");
        list.add("Vivaldi");
    }


    public ClassicalPlayList() {
    }

    public String getSound() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}

package ru.home.spring_course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class RockPlayList {
    private List<String> list;

    public RockPlayList(List<String> list) {
        this.list = list;
        this.list.add("Aria");
        this.list.add("Skillet");
        this.list.add("Linkin Park");
    }

    public String getSound(){
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}

package ru.home.spring_course;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(3));

       List<String> list = new ArrayList<>();
        list.add("Aria");
        list.add("Skillet");
        list.add("Linkin Park");
        System.out.println(list.size());
    }
}

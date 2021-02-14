package ru.geekbrains.nikitag.java2.lesson1.homework.Obstacle;

import ru.geekbrains.nikitag.java2.lesson1.homework.Competitor;

import java.util.Random;

public class Obstacle {
    int height;
    int distance;

//    public Obstacle(int height, int distance) {
//        this.height = height;
//        this.distance = distance;
//    }

    //По идее метод стены, а не всего Родительского класса Препятсвий, но не понимаю как создать массив и использовать методы наследников
    public void run(Competitor competitor) {
    }

    public void jump(Competitor competitor) {
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

}

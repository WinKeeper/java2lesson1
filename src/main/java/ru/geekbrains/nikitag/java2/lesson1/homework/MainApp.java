package ru.geekbrains.nikitag.java2.lesson1.homework;

import ru.geekbrains.nikitag.java2.lesson1.homework.Obstacle.Obstacle;
import ru.geekbrains.nikitag.java2.lesson1.homework.Obstacle.Track;
import ru.geekbrains.nikitag.java2.lesson1.homework.Obstacle.Wall;

import java.util.Random;
import java.util.concurrent.CompletionException;

public class MainApp {
    public static void main(String[] args) {
        Random random = new Random(10);

        Wall[] wall = new Wall[2]; //если запись Obstacle[] wall = new Wall[5] - то методы наследника мы использовать не можем
        for (int i = 0; i < wall.length; i++) {
            int x = random.nextInt(10);
            wall[i] = new Wall(x);
            System.out.println(wall[i].getHeight());
        }

        Track[] track = new Track[2];
        for (int i = 0; i < track.length; i++) {
            int x = random.nextInt(20);
            track[i] = new Track(x);
        }

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Arast", 5, 15);
        cats[1] = new Cat("Ferto", 2, 25);
        cats[2] = new Cat("Gortonzi", 7, 7);

        for (int i = 0; i < wall.length; i++) {
            for (int j = 0; j < cats.length; j++) {
                track[i].run(cats[j]);
                wall[i].jump(cats[j]);
            }
        }



        System.out.println("******************************");
        System.out.println("Задание #3");

        //Общий массив
        Obstacle[] obstacles = new Obstacle[5];
        obstacles[0] = new Wall(7);
        obstacles[1] = new Track(5);
        obstacles[2] = new Wall(2);
        obstacles[3] = new Track(10);
        obstacles[4] = new Track(8);

        Competitor[] competitors = new Competitor[3];
        competitors[0] = new Cat("Капец", 3, 5);
        competitors[1] = new Human("Мешок Мяса", 10, 7);
        competitors[2] = new Robot("GR8TB0Y", 5, 8);
        competitors[2] = new Human("Олег", 4, 11);


        for (int i = 0; i < obstacles.length; i++) {
            for (int j = 0; j < competitors.length; j++) {
                if (obstacles[i].getHeight() > 0) {
                    obstacles[i].jump(competitors[j]);
                }
                obstacles[i].run(competitors[j]);
            }
        }
    }
}

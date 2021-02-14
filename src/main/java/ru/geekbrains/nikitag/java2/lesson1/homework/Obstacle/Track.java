package ru.geekbrains.nikitag.java2.lesson1.homework.Obstacle;

import ru.geekbrains.nikitag.java2.lesson1.homework.Competitor;

public class Track extends Obstacle {
    private Competitor currentCompetitor; //создаём объект класса Competitor

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public void run(Competitor competitor) {
        if (competitor.getMaxDistance() <= distance) {
            System.out.println(competitor.getName() + " не смог пробежать дистанцию");
            currentCompetitor = competitor;
        }
        System.out.println(competitor.getName() + " пробежал всю дистанцию");
        currentCompetitor = competitor;
    }


}

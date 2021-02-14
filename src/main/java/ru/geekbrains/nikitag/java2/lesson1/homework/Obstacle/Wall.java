package ru.geekbrains.nikitag.java2.lesson1.homework.Obstacle;

import ru.geekbrains.nikitag.java2.lesson1.homework.Competitor;


public class Wall extends Obstacle {
    private Competitor currentCompetitor; //создаём объект класса Competitor

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void jump(Competitor competitor) {
        if (competitor.getMaxHeight() <= height) {
            System.out.println(competitor.getName() + " не преодолел препятствие");
            currentCompetitor = competitor;
        }
        System.out.println(competitor.getName() + " преодолел препятствие");
        currentCompetitor = competitor;
    }


}

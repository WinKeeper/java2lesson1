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

//    public void jumpOverTheWall(Competitor competitor) {
//        if (competitor.isRunning() == true) {
//            competitor.jump();
//            currentCompetitor = competitor;
//        }
//    }
//
//    public void backOntrack(Competitor competitor) {
//        if (competitor.isRunning() == true) {
//            competitor.jump();
//            currentCompetitor = competitor;
//        }
//    }
//
//    public void jumpWall() {
//
//    }
//
//    public void setOnTrack(Competitor competitor) {
//        if (!competitor.isRunning()) {
//            competitor.run();
//            System.out.println(competitor.getName() + " побежал по треку.");
//            currentCompetitor = competitor;
//        }
//    }
//
//    public void action(Competitor competitor) {
//        if (!currentCompetitor.isRunning()) {
//            currentCompetitor.run();
//        } if (currentCompetitor.isRunning() == true) {
//            currentCompetitor.jump();
//        }
//    }

}

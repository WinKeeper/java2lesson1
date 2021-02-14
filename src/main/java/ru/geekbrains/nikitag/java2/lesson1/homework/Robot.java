package ru.geekbrains.nikitag.java2.lesson1.homework;

public class Robot implements Competitor {
    private String name;
    private int maxHeight;
    private int maxDistance;
    private boolean running;
    private boolean jumping;

    public Robot(String name, int maxHeight, int maxDistance) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }


    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        running = true;
//        System.out.println(name + " побежал");
    }

    @Override
    public void jump() {
        System.out.println(name + " перепрыгнул препятствие и бежит дальше");
        running = true;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public int getMaxDistance() {
        return maxDistance;
    }
}


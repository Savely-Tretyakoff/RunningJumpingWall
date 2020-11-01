package ru.geekbrains.Catch_the_drop;

public class Main {

    public static void main(String[] args) {

        Robot rob1 = new Robot();
        Cat cat1 = new Cat();
        Human hum1 = new Human();
        Wall wall1 = new Wall();
        RunningTrack runTrack = new RunningTrack();

        System.out.println("Участникам дали старт!");
        System.out.println("На пути стена");
        System.out.println(wall1.getWallHeight() + " метров высота стены!");
        System.out.println("Участники прыгают!");
        System.out.println(cat1.getJumpResult());
        System.out.println(hum1.getJumpResult());
        System.out.println(rob1.getJumpResult());
        System.out.println("Участники вышли на дистанцию");
        System.out.println(cat1.getRunResult());
        System.out.println(hum1.getRunResult());
        System.out.println(rob1.getRunResult());

        }
    }



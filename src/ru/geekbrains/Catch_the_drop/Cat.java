package ru.geekbrains.Catch_the_drop;

public class Cat implements Actions{

    Wall wall1 = new Wall();
    RunningTrack rnTrack = new RunningTrack();
    int a = (int) (Math.random() * 100);
    int b = (int) (Math.random() * 18);
    String done = "Кошка перепрыгнула";
    String fall = "Кошка в мясо";
    String done2 = "Кошка преодалела дистанцию";
    String fall2 = "Кошку сбили";

    @Override
    public String getRunResult() {

        if (rnTrack.getRuntTrackLength() < a) {
            return done2;
        }else {
            return fall2;
        }
    }

    @Override
    public String getJumpResult() {

        if (wall1.getWallHeight() < b) {
            return done;
        } else {
            return fall;
        }
    }




}

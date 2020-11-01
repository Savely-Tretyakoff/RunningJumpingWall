package ru.geekbrains.Catch_the_drop;

public class Robot implements Actions {
    private int jump;
    private int run;
    Wall wall1 = new Wall();
    RunningTrack rnTrack = new RunningTrack();
    int a = (int) (Math.random() * 120);
    int b = (int) (Math.random() * 30);
    String done = "Робот перепрыгнул";
    String fall = "Робот на разборке";
    String done2 = "Робот преодалел дистанцию";
    String fall2 = "Робот поломался";

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

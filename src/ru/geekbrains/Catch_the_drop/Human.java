package ru.geekbrains.Catch_the_drop;

public class Human implements Actions{
    private int jump;
    private int run;
    Wall wall1 = new Wall();
    RunningTrack rnTrack = new RunningTrack();
    int a = (int) (Math.random() * 110);
    int b = (int) (Math.random() * 24);
    String done = "Человек перепрыгнул";
    String fall = "Человек в реанимации";
    String done2 = "Человек преодалел дистанцию";
    String fall2 = "Человек споткнулся";

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

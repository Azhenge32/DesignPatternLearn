package com.azhen.other.behavioral.state;

public class SpeedState extends CourseVideoState {
    @Override
    public void play() {
        super.context.setState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进");
    }

    @Override
    public void pause() {
        System.out.println("暂停");
    }

    @Override
    public void stop() {
        super.context.setState(CourseVideoContext.STOP_STATE);
    }
}

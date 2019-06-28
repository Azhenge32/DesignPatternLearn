package com.azhen.other.behavioral.state;

public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("播放");
    }

    @Override
    public void speed() {
        super.context.setState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.context.setState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.context.setState(CourseVideoContext.STOP_STATE);
    }
}

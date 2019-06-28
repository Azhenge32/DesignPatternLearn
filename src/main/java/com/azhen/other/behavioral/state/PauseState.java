package com.azhen.other.behavioral.state;

public class PauseState extends CourseVideoState {
    @Override
    public void play() {
        super.context.setState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        super.context.setState(CourseVideoContext.SPEED_STATE);
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

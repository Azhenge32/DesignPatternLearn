package com.azhen.other.behavioral.state;

public class StopState extends CourseVideoState {
    @Override
    public void play() {
        super.context.setState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("Error 不能快进");
    }

    @Override
    public void pause() {
        System.out.println("Error 不能暂停");
    }

    @Override
    public void stop() {
        System.out.println("停止");
    }
}

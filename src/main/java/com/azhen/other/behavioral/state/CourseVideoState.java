package com.azhen.other.behavioral.state;

public abstract class CourseVideoState {
    protected CourseVideoContext context;

    public void setContext(CourseVideoContext context) {
        this.context = context;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}

package com.azhen.other.behavioral.state;

public class CourseVideoContext {
    private CourseVideoState state;
    public final static PlayState PLAY_STATE = new PlayState();
    public final static StopState STOP_STATE = new StopState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static SpeedState SPEED_STATE = new SpeedState();

    public CourseVideoState getState() {
        return state;
    }

    public void setState(CourseVideoState state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void play() {
        this.state.play();
    }

    public void speed() {
        this.state.speed();
    }

    public void stop() {
        this.state.stop();
    }

    public void pause() {
        this.state.pause();
    }
}

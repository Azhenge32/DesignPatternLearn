package com.azhen.designpattern.behavior.state.example1;

public abstract class LiftState {
    protected Context context;

    public void setContext(Context _context) {
        this.context = _context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}

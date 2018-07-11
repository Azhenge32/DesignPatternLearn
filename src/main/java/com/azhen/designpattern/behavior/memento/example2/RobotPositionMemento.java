package com.azhen.designpattern.behavior.memento.example2;
//Memento（备忘录)
public class RobotPositionMemento {
    private String mRobotName;
    private int mCurXPos;
    private int mCurYpos;

    public RobotPositionMemento(String mRobotName, int mCurXPos, int mCurYpos) {
        this.mRobotName = mRobotName;
        this.mCurXPos = mCurXPos;
        this.mCurYpos = mCurYpos;
    }

    public String getmRobotName() {
        return mRobotName;
    }

    public int getmCurXPos() {
        return mCurXPos;
    }

    public int getmCurYpos() {
        return mCurYpos;
    }
}

package com.azhen.designpattern.behavior.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class NumObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {

        NumObservable myObserable = (NumObservable) o;
        System.out.println("Data has changed to " + myObserable.getData());

    }
}

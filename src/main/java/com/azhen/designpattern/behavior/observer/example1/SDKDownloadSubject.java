package com.azhen.designpattern.behavior.observer.example1;

public class SDKDownloadSubject extends Subject {
    public void netProcessChange(String data) {
        this.motifyObservers(data);
    }
}
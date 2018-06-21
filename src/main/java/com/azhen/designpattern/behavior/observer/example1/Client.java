package com.azhen.designpattern.behavior.observer.example1;

public class Client {
    public static void main(String[] args) {
        SDKDownloadSubject sdkDownloadSubject = new SDKDownloadSubject();
        Observer observer = new ProgramMonkeyObserver();
        sdkDownloadSubject.attach(observer);
        sdkDownloadSubject.netProcessChange("1%");
        sdkDownloadSubject.netProcessChange("51%");
        sdkDownloadSubject.netProcessChange("100%");
    }
}

package com.azhen.other.behavioral.observer.guavaevent;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {
    @Subscribe
    public void subscribe(String str) {
        System.out.println(str);
    }
}

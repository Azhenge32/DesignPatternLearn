package com.azhen.other.behavioral.observer.guavaevent;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent event = new GuavaEvent();
        eventBus.register(event);
        eventBus.post("content");
    }
}

package com.azhen.designpattern.structure.responsibility_chain.nextHandler;


public interface Handler {
    void handLeave(LeaveNote leaveNote);
    void setNextHandler(Handler h);
}

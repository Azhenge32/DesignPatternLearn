package com.azhen.designpattern.behavior.responsibility_chain.nextHandler;

public class ManagerHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handLeave(LeaveNote leaveNote) {
        System.out.println("总经理同意" + leaveNote.getName() + "申请请假" + leaveNote.getLeaverDayNum() + "天,原因:" + leaveNote.getLeaveReason());
    }

    @Override
    public void setNextHandler(Handler h) {
        nextHandler = h;
    }

}

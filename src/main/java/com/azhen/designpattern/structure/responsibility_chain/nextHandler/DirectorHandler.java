package com.azhen.designpattern.structure.responsibility_chain.nextHandler;

public class DirectorHandler implements Handler{
    private Handler nextHandler;
    @Override
    public void handLeave(LeaveNote leaveNote) {
        if (leaveNote.getLeaverDayNum() <= 3) {
            System.out.println("主管同意" + leaveNote.getName() + "申请请假" + leaveNote.getLeaverDayNum() + "天,原因:" + leaveNote.getLeaveReason());
        } else {
            nextHandler.handLeave(leaveNote);
        }
    }

    @Override
    public void setNextHandler(Handler h) {
        nextHandler = h;
    }
}

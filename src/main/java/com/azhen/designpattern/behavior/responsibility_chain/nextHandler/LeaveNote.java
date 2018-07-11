package com.azhen.designpattern.behavior.responsibility_chain.nextHandler;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LeaveNote {
    private String name;
    private String leaveReason;
    private int leaverDayNum;
}

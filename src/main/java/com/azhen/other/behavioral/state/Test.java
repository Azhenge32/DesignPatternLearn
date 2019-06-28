package com.azhen.other.behavioral.state;

public class Test {
    public static void main(String[] args) {
        CourseVideoContext context = new CourseVideoContext();
        context.setState(new PlayState());
        System.out.println("当前状态: " + context.getState().getClass().getSimpleName());
        context.pause();
        System.out.println("当前状态: " + context.getState().getClass().getSimpleName());
        context.speed();
        System.out.println("当前状态: " + context.getState().getClass().getSimpleName());
        context.stop();
        System.out.println("当前状态: " + context.getState().getClass().getSimpleName());
        context.speed();
        System.out.println("当前状态: " + context.getState().getClass().getSimpleName());
    }
}

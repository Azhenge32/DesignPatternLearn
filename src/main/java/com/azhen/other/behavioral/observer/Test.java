package com.azhen.other.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式精讲");
        Teacher teacher = new Teacher("Azhen");

        course.addObserver(teacher);

        Question question = new Question();
        question.setUserName("Geely");
        question.setQuestionContent("Java主函数如何编写");
        course.produceQuestion(course, question);
    }
}

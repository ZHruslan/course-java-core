package com.rakovets.course.java.core.practice.exception_handling.Task;

public class Demo01 {
    public static void main(String[] args) {
        Task01 task = new Task01();
        try {
            task.task1();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}

package com.rakovets.course.java.core.practice.exception_handling.Task;

public class Demo04 {
    public static void main(String[] args) {
        Task04 task = new Task04();
        try {
            task.age(14);
        } catch (Task04_01 e) {
            System.out.println(e.getMessage());
        }
    }
}

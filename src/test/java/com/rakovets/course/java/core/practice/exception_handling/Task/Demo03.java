package com.rakovets.course.java.core.practice.exception_handling.Task;

public class Demo03 {
    public static void main(String[] args) {
        Task03 task = new Task03();
        try {
            task.age(19);
        } catch (Task03_01 e) {
            System.out.println("stack trace");
        }
    }
}

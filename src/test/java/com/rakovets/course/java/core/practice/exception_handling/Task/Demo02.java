package com.rakovets.course.java.core.practice.exception_handling.Task;

public class Demo02 {
    public static void main(String[] args) {
        Task02 task = new Task02();
        try {
            task.task02();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}


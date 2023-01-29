package com.rakovets.course.java.core.practice.exception_handling.Task;

public class Demo05 {
    public static void main(String[] args) {
        Task05 task = new Task05();
        try {
            task.Task05();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

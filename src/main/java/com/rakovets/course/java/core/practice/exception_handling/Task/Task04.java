package com.rakovets.course.java.core.practice.exception_handling.Task;

public class Task04 {
    public boolean age(int age) {
        if (age <= 18) {
            throw new Task04_01("You are under 18");
        }
        return true;
    }
}

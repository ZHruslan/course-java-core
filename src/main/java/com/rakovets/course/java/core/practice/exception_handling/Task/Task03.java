package com.rakovets.course.java.core.practice.exception_handling.Task;

public class Task03 {
    public boolean age(int your_age) throws Task03_01 {
        if (your_age <= 18) {
            throw new Task03_01();
        }
        return true;
    }

}

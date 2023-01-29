package com.rakovets.course.java.core.practice.exception_handling.Task;

public class Task05 {
    int[] array = new int[5];

    void Task05() throws ArrayIndexOutOfBoundsException {
        try {
            array[10] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException(e.getMessage());
        }
    }
}

package ru.home.otus;

import static com.google.common.math.IntMath.checkedAdd;

public class HelloOtus {
    public void sum () {
        int i = checkedAdd(3, 4);
        System.out.println(i);
    }
}

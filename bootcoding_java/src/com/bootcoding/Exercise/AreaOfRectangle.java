package com.bootcoding.Exercise;

import java.lang.reflect.Parameter;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int height=7;
        int width=5;
        int area;
        int parameter = 2 * (height + width);
        System.out.println("Parameter of Rectangle"+parameter);
        area=width*height;
        System.out.println("Area of Rectangle"+area);

    }
}

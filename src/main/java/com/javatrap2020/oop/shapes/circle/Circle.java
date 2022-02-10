package com.javatrap2020.oop.shapes.circle;

import com.javatrap2020.oop.shapes.ShapeInterface;

public class Circle implements ShapeInterface {

    private String color;
    private double R;

    public Circle(String color, double r) {
        this.color = color;
        R = r;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(R, 2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + getColor() + '\'' +
                ", R=" + R + ", Area="
                + calculateArea() + '}';
    }
    
}

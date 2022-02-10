package com.javatrap2020.oop.shapes.square;

import com.javatrap2020.oop.shapes.ShapeInterface;

public class Square implements ShapeInterface {

    private String color;
    private double side;

    public Square(String color, double side) {
        this.color = color;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + getColor() + '\'' +
                ", side=" + getSide() + ", Area="
                + calculateArea() + '}';
    }
}

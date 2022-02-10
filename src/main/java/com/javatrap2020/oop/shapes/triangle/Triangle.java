package com.javatrap2020.oop.shapes.triangle;

import com.javatrap2020.oop.shapes.ShapeInterface;

public class Triangle implements ShapeInterface {

    private String color;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, double side1, double side2, double side3) {
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double calculateArea() {
        double P = (side1 + side2 + side3) / 2;
        double S = Math.sqrt((P * (P - side1) * (P - side2) * (P - side3)));
        return S;
    }

    public double getHypotenuse() {
        double hypotenuse = 0;
        double[] arr = {side1, side2, side3};

        for (double i : arr) {
            if (hypotenuse < i) hypotenuse = i;
        }
        return hypotenuse;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + getColor() + '\'' +
                ", Hypotenuse=" + getHypotenuse() +
                ", Area=" + calculateArea() + '}';
    }
}


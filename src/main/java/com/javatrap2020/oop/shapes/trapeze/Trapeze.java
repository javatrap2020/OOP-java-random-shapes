package com.javatrap2020.oop.shapes.trapeze;

import com.javatrap2020.oop.shapes.ShapeInterface;

public class Trapeze implements ShapeInterface {

    private String color;
    private double base1;
    private double base2;
    private double height;

    public Trapeze(String color, double base1, double base2, double height) {
        this.color = color;
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double calculateArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Trapeze{" +
                "color='" + color + '\'' +
                ", height=" + getHeight() +
                ", Area=" + calculateArea()
                +'}';
    }
}

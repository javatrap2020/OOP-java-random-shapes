package com.javatrap2020.oop.shapes.circle;

import com.javatrap2020.oop.shapes.ShapeCreator;
import com.javatrap2020.oop.shapes.ShapeInterface;

import static com.javatrap2020.oop.color.ColorEnum.randomColor;
import static com.javatrap2020.oop.shapes.ClassGenerator.GenerateValue;

public class CircleCreator extends ShapeCreator {

    @Override
    public ShapeInterface Doing() {
        return new Circle(randomColor().toString(), GenerateValue(1, 60));
    }
}

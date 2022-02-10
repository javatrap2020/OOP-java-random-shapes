package com.javatrap2020.oop.shapes.square;

import com.javatrap2020.oop.shapes.ShapeCreator;
import com.javatrap2020.oop.shapes.ShapeInterface;
import com.javatrap2020.oop.shapes.circle.Circle;

import static com.javatrap2020.oop.color.ColorEnum.randomColor;
import static com.javatrap2020.oop.shapes.ClassGenerator.GenerateValue;

public class SquareCreator extends ShapeCreator {

    @Override
    public ShapeInterface Doing() {
        return new Square(randomColor().toString(), GenerateValue(1, 20));
    }
}

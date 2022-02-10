package com.javatrap2020.oop.shapes.trapeze;

import com.javatrap2020.oop.shapes.ShapeCreator;
import com.javatrap2020.oop.shapes.ShapeInterface;
import com.javatrap2020.oop.shapes.triangle.Triangle;

import static com.javatrap2020.oop.color.ColorEnum.randomColor;
import static com.javatrap2020.oop.shapes.ClassGenerator.GenerateValue;

public class TrapezeCreator extends ShapeCreator {
    @Override
    public ShapeInterface Doing() {
        return new Trapeze(randomColor().toString(), GenerateValue(1, 20), GenerateValue(1, 20), GenerateValue(1, 20));
    }
}

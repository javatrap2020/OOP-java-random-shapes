package com.javatrap2020.oop;

import com.javatrap2020.oop.shapes.ShapeCreator;
import com.javatrap2020.oop.shapes.ShapeInterface;
import com.javatrap2020.oop.shapes.circle.CircleCreator;
import com.javatrap2020.oop.shapes.square.SquareCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.javatrap2020.oop.shapes.ClassGenerator.GenerateValue;

public class RunShapesOOP {

    public static Random random = new Random();

    public static void main(String[] args) {

        List<ShapeCreator> randomShapes = new ArrayList<>();
        randomShapes.add(new CircleCreator());
        randomShapes.add(new SquareCreator());

        int SIZE = (int)  GenerateValue(1, 10);

        ShapeInterface[] shapeBases = new ShapeInterface[SIZE];

        for (int i = 0; i < SIZE; i++) {
            shapeBases[i] = randomShapes.get((int)GenerateValue(0, randomShapes.size())).Doing();
        }

        for (ShapeInterface i : shapeBases) {
            i.draw();
        }

    }
}

package com.javatrap2020.oop.color;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.javatrap2020.oop.RunShapesOOP.random;

public enum  ColorEnum {

    RED("red" + "\033[0;31m"), BLACK("black" + "\033[4;30m"), BLUE("blue" + "\033[4;34m"), GREEN("green" + "\033[4;32m");

    protected final String colorName;

    ColorEnum(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public String toString() {
        return this.colorName;
    }

    protected static final List<ColorEnum> NAMES_COLORS = Collections.unmodifiableList(Arrays.asList(values()));

    protected static final int SIZE = NAMES_COLORS.size();

    public static ColorEnum randomColor() {
        return NAMES_COLORS.get(random.nextInt(SIZE));
    }

}

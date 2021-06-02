package com.loiane;

public sealed abstract class Shape permits Circle, Rectangle, Square {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public String getColor() {
        return color;
    }
}

package com.loiane;

public non-sealed class Rectangle extends Shape {

    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return this.length * this. width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

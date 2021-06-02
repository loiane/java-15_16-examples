package com.loiane;

public non-sealed class Square extends Shape {

    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    public double getSide() {
        return side;
    }
}

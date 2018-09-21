package me.kospo.shapes;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) {
        assert radius > 0;

        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

package me.kospo;

public class Rectangle implements Figure {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        assert a > 0;
        assert b > 0;

        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }
}

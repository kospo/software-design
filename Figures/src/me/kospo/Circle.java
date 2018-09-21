package me.kospo;

public class Circle implements Figure {
    private final double r;

    public Circle(double r) {
        assert r > 0;

        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
}

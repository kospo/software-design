package me.kospo.shapes;

public class Rectangle implements Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        assert width > 0;
        assert height > 0;

        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

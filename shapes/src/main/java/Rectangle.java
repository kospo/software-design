public class Rectangle implements Figure {
    private final double width;
    private final double height;

    public Rectangle(double a, double b) {
        assert a > 0;
        assert b > 0;

        this.width = a;
        this.height = b;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

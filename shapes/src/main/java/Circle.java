public class Circle implements Figure {
    private final double radius;

    public Circle(double r) {
        assert r > 0;

        this.radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

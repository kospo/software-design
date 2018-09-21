import org.junit.Assert;
import org.junit.Test;

public class TestFigures {
    public static final int CIRCLE_RADIUS = 1;
    public static final int RECTANGLE_A = 2;
    public static final int RECTANGLE_B = 3;
    public static final int SQUARE_A = 4;

    @Test
    public void testFigures() {
        Figure c = new Circle(CIRCLE_RADIUS);
        Figure r = new Rectangle(RECTANGLE_A, RECTANGLE_B);
        Figure s = new Square(SQUARE_A);

        Assert.assertEquals(c.getArea(), Math.PI * CIRCLE_RADIUS * CIRCLE_RADIUS, 1E-5);
        Assert.assertEquals(r.getArea(), RECTANGLE_A * RECTANGLE_B, 1E-5);
        Assert.assertEquals(s.getArea(), SQUARE_A * SQUARE_A, 1E-5);
    }
}

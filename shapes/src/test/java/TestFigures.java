import me.kospo.shapes.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

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

        assertEquals(c.getArea(), Math.PI * CIRCLE_RADIUS * CIRCLE_RADIUS, 1E-5);
        assertEquals(r.getArea(), RECTANGLE_A * RECTANGLE_B, 1E-5);
        assertEquals(s.getArea(), SQUARE_A * SQUARE_A, 1E-5);
    }

    @Test
    public void testComparator() {
        Figure circle = new Circle(CIRCLE_RADIUS);
        Figure rectangle = new Rectangle(RECTANGLE_A, RECTANGLE_B);
        Figure square = new Square(SQUARE_A);

        List<Figure> list = Arrays.asList(square, rectangle, circle);
        Collections.sort(list, new FigureComparator());
        assertEquals(list.get(0), circle);
        assertEquals(list.get(1), square);
        assertEquals(list.get(2), rectangle);
    }
}

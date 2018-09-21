import me.kospo.Circle;
import me.kospo.Figure;
import me.kospo.Rectangle;
import me.kospo.Square;
import org.junit.Assert;
import org.junit.Test;

public class TestFigures {
    @Test
    public void testFigures() {
        Figure c = new Circle(1);
        Figure r = new Rectangle(2, 3);
        Figure s = new Square(4);

        Assert.assertEquals(c.getArea(), Math.PI, 1E-5);
        Assert.assertEquals(r.getArea(), 6, 1E-5);
        Assert.assertEquals(s.getArea(), 16, 1E-5);
    }
}

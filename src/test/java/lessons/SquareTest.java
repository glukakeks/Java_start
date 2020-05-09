package lessons;

import lesson1.classes.Square;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SquareTest {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(25.0, 25.0 );
    }
}

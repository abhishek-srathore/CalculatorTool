import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTest {

    @Test
    public void testSubtract() {
        Subtraction subtraction = new Subtraction();
        int result = subtraction.subtract(10, 4);
        Assert.assertEquals(result, 6, "10 - 4 should equal 6");
    }
}
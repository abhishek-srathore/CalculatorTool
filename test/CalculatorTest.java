import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(7, 8);
        Assert.assertEquals(result, 15, "7 + 8 should equal 15");
    }
}
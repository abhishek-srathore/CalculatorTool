import org.testng.Assert;
import org.testng.annotations.Test;
import calculator.Calculator;

public class AdditionTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(7, 8);
        Assert.assertEquals(result, 15, "7 + 8 should equal 15");
    }
}
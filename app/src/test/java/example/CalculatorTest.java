package example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void setup() {
        calculator = new Calculator();
    }
    @Test
    public void testAddBasic() {
        Assert.assertEquals(4, calculator.add(1, 3));
    }
    @Test
    public void testAddNegative() {
        Assert.assertEquals(-6, calculator.add(2, -8));
    }
    @Test
    public void testMinusBasic() {
        Assert.assertEquals(10, calculator.minus(15, 5));
    }
    @Test
    public void testMinusNegative() {
        Assert.assertEquals(5, calculator.minus(-15, -20));
    }
    @Test
    public void testMultiplyBasic() {
        Assert.assertEquals(10, calculator.multiply(2, 5));
    }
    @Test
    public void testMultiplyLarge() {
        Assert.assertEquals(1530381486, calculator.multiply(28654, 53409));
    }
    @Test
    public void testDivideBasic() {Assert.assertEquals(5, calculator.divide(10, 2), 0.01);}
    @Test
    public void testDivideDouble() {
        Assert.assertEquals(2.25, calculator.divide(9, 4), 0.01);
    }
    @Test
    public void testDivideRational() {
        Assert.assertEquals(1.167, calculator.divide(7, 6), 0.01);
    }
}

import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
    }
    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 6;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 6;
        y.denominator = 2;
        x.multiply(y);
        Assert.assertEquals(9, x.numerator);
    }
    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 6;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 6;
        x.divide(y);
        Assert.assertEquals(9, x.numerator);
    }
    @Test
    public void testEqual(){  //Case Both Equal with same value
        Rational x = new Rational();
        x.numerator = 8;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 16;
        y.denominator = 4;
        Assert.assertTrue(x.equals(y));
    }
    @Test
    public void testCompare(){  //Case Both Equal with same value
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 1;
        Rational y = new Rational();
        y.numerator = 8;
        y.denominator = 4;
        Assert.assertEquals(-1, x.compareTo(y));
    }
    @Test
    public void testToString(){
        Rational x = new Rational();
        x.numerator = 8;
        x.denominator = 9;
        Assert.assertEquals("8/9", x.toString());
    }
}

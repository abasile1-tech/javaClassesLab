import com.codebase.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void canAdd() {
        assertEquals(4, Calculator.add(2,2));
    }

    @Test
    public void canSubtract() {
        assertEquals(2, Calculator.subtract(4,2));
    }

    @Test
    public void canMultiply() {
        assertEquals(8, Calculator.multiply(4,2));
    }

    @Test
    public void canDivide() {
        assertEquals(4, Calculator.divide(8,2), 0.0);
    }


}

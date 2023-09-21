import com.codebase.Calculator;
import org.junit.Test;
import static com.codebase.Calculator.add;
import static com.codebase.Calculator.subtract;
import static com.codebase.Calculator.multiply;
import static com.codebase.Calculator.divide;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void canAdd() {
        assertEquals(4, add(2,2));
    }

    @Test
    public void canSubtract() {
        assertEquals(2, subtract(4,2));
    }

    @Test
    public void canMultiply() {
        assertEquals(8, multiply(4,2));
    }

    @Test
    public void canDivide() {
        assertEquals(4, divide(8,2), 0.0);
    }


}

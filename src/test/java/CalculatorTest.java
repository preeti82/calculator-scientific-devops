
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void truePositiveSquareRoot(){
        assertEquals(new Main().squareRoot(144), 12, 1e-15);
    }

    @Test
    public void truePositiveFactorial(){
        assertEquals(new Main().factorial(5), 120);
    }

    @Test
    public void truePositivePower(){
        assertEquals(new Main().powerFunction(5, 5), 3125, 1e-15);
    }



}

import org.junit.Test;
import resources.CalculatorResource;

import static org.junit.Assert.assertEquals;

public class CalculatorResourceTest{

    @Test
    public void testCalculate(){
        CalculatorResource calculatorResource = new CalculatorResource();

        String expression = "100+300";
        assertEquals(400, calculatorResource.calculate(expression));

        expression = " 300 - 99 ";
        assertEquals(201, calculatorResource.calculate(expression));
    }

    @Test
    public void testSum(){
        CalculatorResource calculatorResource = new CalculatorResource();

        String expression = "100+300";
        assertEquals(400, calculatorResource.sum(expression));

        expression = "300+99";
        assertEquals(400, calculatorResource.sum(expression));
    }

    @Test
    public void testSubtraction(){
        CalculatorResource calculatorResource = new CalculatorResource();

        String expression = "999-100";
        assertEquals(899, calculatorResource.subtraction(expression));

        expression = "20-2";
        assertEquals(200, calculatorResource.subtraction(expression));
    }
    public void testMultiplication(){
        CalculatorResource calculatorResource = new CalculatorResource();

        String expression = "133*10";
        assertEquals(1330, calculatorResource.Multiplication(expression));

        expression = "3*21";
        assertEquals(63, calculatorResource.Multiplication(expression));
    }
    public void testDivision(){
         CalculatorResource calculatorResource = new CalculatorResource();

        String expression = "1330/10";
        assertEquals(133, calculatorResource.Multiplication(expression));

        expression = "10/3";
        assertEquals(3.33, calculatorResource.Multiplication(expression));
}

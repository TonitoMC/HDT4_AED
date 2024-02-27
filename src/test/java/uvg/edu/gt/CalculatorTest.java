package uvg.edu.gt;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testInfixToPostfix() {
        Calculator calc = new Calculator("vector");
        assertEquals("12+", calc.infixToPostfix("1+2"));
        assertEquals("123*+", calc.infixToPostfix("1+2*3"));
        assertEquals("12+3*", calc.infixToPostfix("(1+2)*3"));
        assertEquals("12+34+*", calc.infixToPostfix("(1+2)*(3+4)"));
    }

    public void testPostfix() {
        Calculator calc = new Calculator("vector");

        assertEquals(3, calc.postfix("12+"));
        assertEquals(7, calc.postfix("123*+"));
        assertEquals(9, calc.postfix("12+3*"));
        assertEquals(21, calc.postfix("12+34+*"));
    }

    public void testEval() {
        Calculator calc = new Calculator("vector");

        assertEquals(3, calc.eval("1+2"));
        assertEquals(7, calc.eval("1+2*3"));
        assertEquals(9, calc.eval("(1+2)*3"));
        assertEquals(21, calc.eval("(1+2)*(3+4)"));
    }
}
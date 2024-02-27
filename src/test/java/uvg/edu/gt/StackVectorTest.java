package uvg.edu.gt;

import junit.framework.TestCase;

public class StackVectorTest extends TestCase {

    public void testPush() {
        StackVector<String> stack = new StackVector<>();
        stack.push("p");
        assertEquals("p", stack.peek());
    }

    public void testPop() {
        StackVector<String> stack = new StackVector<>();
        stack.push("a");
        stack.push("Hello");
        assertEquals("Hello", stack.pop());
        assertEquals("a", stack.peek());
    }

    public void testPeek() {
        StackVector<String> stack = new StackVector<>();
        stack.push("b");
        stack.push("b");
        assertEquals("b", stack.peek());
    }

    public void testIsEmpty() {
        StackVector<Double> stack = new StackVector<>();
        assertTrue(stack.isEmpty());
        stack.push(3.14);
        assertFalse(stack.isEmpty());
    }
}
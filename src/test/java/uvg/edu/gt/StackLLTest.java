package uvg.edu.gt;

import junit.framework.TestCase;

public class StackLLTest extends TestCase {

    public void testPush() {
        StackLL<String> stack = new StackLL<>("single");
        stack.push("p");
        assertEquals("p", stack.peek());
    }

    public void testPop() {
        StackLL<String> stack = new StackLL<>("double");
        stack.push("a");
        stack.push("Hello");
        assertEquals("Hello", stack.pop());
        assertEquals("a", stack.peek());
    }

    public void testPeek() {
        StackLL<String> stack = new StackLL<>("double");
        stack.push("b");
        stack.push("b");
        assertEquals("b", stack.peek());
    }

    public void testIsEmpty() {
        StackLL<Double> stack = new StackLL<>("double");
        assertTrue(stack.isEmpty());
        stack.push(3.14);
        assertFalse(stack.isEmpty());
    }
}
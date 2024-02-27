package uvg.edu.gt;

import junit.framework.TestCase;

public class StackArrayListTest extends TestCase {

    public void testPush() {
        StackArrayList<String> stack = new StackArrayList<>();
        stack.push("p");
        assertEquals("p", stack.peek());
    }

    public void testPop() {
        StackArrayList<String> stack = new StackArrayList<>();
        stack.push("a");
        stack.push("Hello");
        assertEquals("Hello", stack.pop());
        assertEquals("a", stack.peek());
    }

    public void testPeek() {
        StackArrayList<String> stack = new StackArrayList<>();
        stack.push("b");
        stack.push("b");
        assertEquals("b", stack.peek());
    }

    public void testIsEmpty() {
        StackArrayList<Double> stack = new StackArrayList<>();
        assertTrue(stack.isEmpty());
        stack.push(3.14);
        assertFalse(stack.isEmpty());
    }
}
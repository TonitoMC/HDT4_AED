package uvg.edu.gt;

import junit.framework.TestCase;

public class SingleLinkedListTest extends TestCase {

    public void testAddLast() {
        SingleLinkedList<String> list = new SingleLinkedList<String>();
        list.addLast("1");
        assertEquals("1",list.getLast());
    }

    public void testRemoveLast() {
        SingleLinkedList<String> list = new SingleLinkedList<String>();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        assertEquals("3", list.getLast());
        list.removeLast();
        assertEquals("2", list.getLast());
        list.removeLast();
        assertEquals("1", list.getLast());
    }

    public void testGetLast() {
        SingleLinkedList<String> list = new SingleLinkedList<String>();
        list.addLast("1");
        assertEquals("1", list.getLast());
        list.addLast("2");
        assertEquals("2", list.getLast());
    }

    public void testIsEmpty() {
        SingleLinkedList<String> list = new SingleLinkedList<String>();
        assertTrue(list.isEmpty());
        list.addLast("1");
        assertFalse(list.isEmpty());
    }
}
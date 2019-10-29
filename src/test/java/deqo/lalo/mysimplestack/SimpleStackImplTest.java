package deqo.lalo.mysimplestack;

import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.Assert.*;

public class SimpleStackImplTest {

    @Test
    public void testIsEmpty() {
        SimpleStackImpl simpleStack = new SimpleStackImpl();
        Item item1 = new Item(3);
        assertTrue(simpleStack.isEmpty());
        simpleStack.push(item1);
        assertFalse(simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() {
        SimpleStackImpl simpleStack = new SimpleStackImpl();
        assertEquals(simpleStack.getSize(), 0);
        Item item1 = new Item(3);
        simpleStack.push(item1);
        assertEquals(simpleStack.getSize(), 1);
    }

    @Test
    public void testPush() {
        SimpleStackImpl simpleStack = new SimpleStackImpl();
        Item item1 = new Item(3);
        simpleStack.push(item1);
        assertNotEquals(simpleStack.getSize(), 0);
    }

    @Test
    public void testPeek() {
        SimpleStackImpl simpleStack = new SimpleStackImpl();
        Item item1 = new Item(3);
        simpleStack.push(item1);
        assertSame(simpleStack.peek(), item1);
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekE() {
        SimpleStackImpl simpleStack = new SimpleStackImpl();
        simpleStack.peek();
    }

    @Test
    public void testPop() {
        SimpleStackImpl simpleStack = new SimpleStackImpl();
        Item item1 = new Item(5);
        simpleStack.push(item1);
        assertSame(simpleStack.pop(), item1);
        assertTrue(simpleStack.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void testPopE() {
        SimpleStackImpl simpleStack = new SimpleStackImpl();
        simpleStack.pop();
    }
}
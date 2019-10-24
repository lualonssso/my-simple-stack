package deqo.lalo.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    Item item = new Item(4);

    @Test
    public void testGetNum() {
        assertEquals( 4,item.getNum());
    }

    @Test
    public void testSetNum() {
        item.setNum(6);
        assertEquals(6, item.getNum());
    }
}
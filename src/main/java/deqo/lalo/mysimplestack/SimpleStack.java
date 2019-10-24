package deqo.lalo.mysimplestack;

import java.util.EmptyStackException;

public interface SimpleStack {

    /** Tests if this stack is empty */
    public boolean isEmpty();

    /** Returns the number of items in this stck */
    public int getSize();

    /** Pushes an item onto the top of the slack
     * null item is allowed
     */
    public void push(Item item);

    /** Looks at the object at the top of the stack without removing it from the stack*/
    public Item peek() throws EmptyStackException;

    /** Removes the object at the top of the stack and returns that object as the value of this function
     * @throws EmptyStackException if this stack i empty
     */
    public Item pop() throws EmptyStackException;
}

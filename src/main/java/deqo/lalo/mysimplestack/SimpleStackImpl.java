package deqo.lalo.mysimplestack;


import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class SimpleStackImpl implements SimpleStack {

    List<Item> stack = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        if (stack.isEmpty())
            return true;
        return false;
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.get(getSize()-1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Item lastitem = stack.get(getSize()-1);
        stack.remove(getSize()-1);
        return lastitem;
    }
}

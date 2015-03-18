package dcll.aifr.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by Anass on 06/03/2015.
 * Commentaire répondant à l'exigence #3
 */
public class SimpleStackImpl implements SimpleStack {
   Stack<Object> wrappedStack= new Stack<Object>();
    @Override
    public boolean isEmpty() {
        return wrappedStack.isEmpty();
    }

    @Override
    public int getSize() {
        return wrappedStack.size();
    }

    @Override
    public void push(Item item) {
       wrappedStack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }
}

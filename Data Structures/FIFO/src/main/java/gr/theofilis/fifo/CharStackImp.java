package gr.theofilis.fifo;

import java.io.PrintStream;
import java.util.NoSuchElementException;

/**
 *
 * @author George Theofilis
 */
public class CharStackImp implements CharStack, Cloneable {

    /**
     * This is the list which the character will be stored
     */
    private List<Character> chars;

    public CharStackImp() {
        this("CharStack");
    }

    public CharStackImp(String name) {
        chars = new List<Character>(name);
    }

    @Override
    public boolean isEmpty() {
        return chars.isEmpty();
    }

    @Override
    public void push(char item) {
        chars.insertAtFront(item);
    }

    @Override
    public char pop() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("This stack is empty");
        }
        return chars.removeFromFront();
    }

    @Override
    public void printStack(PrintStream stream) {
        chars.print(stream);
    }

    @Override
    public int size() {
        return chars.size();
    }

    public List<Character> getList() {
        return chars;
    }

    public void setList(List<Character> stack) {
        chars = stack;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
}

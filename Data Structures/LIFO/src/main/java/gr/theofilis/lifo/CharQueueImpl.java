package gr.theofilis.lifo;

import java.io.PrintStream;
import java.util.NoSuchElementException;

/**
 *
 * @author George Theofilis
 */
public class CharQueueImpl implements CharQueue, Cloneable {

    private List<Character> queue;

    /**
     * Constructs an empty char queue with name  CharQueue.
     */
    public CharQueueImpl() {
        this("CharQueue");
    }

    /**
     * Constructs an empty char queue with name  the parameter.
     * @param name the CharQueue name
     */
    public CharQueueImpl(String name) {
        queue = new List<Character>(name);
    }
    
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();

    }

    @Override
    public void put(char item) {
        queue.insertAtBack(item);
    }

    @Override
    public char get() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("The queue is empty");
        }
        return queue.removeFromFront();
    }

    @Override
    public void printQueue(PrintStream stream) {
        queue.print(stream);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }

    public static void main(String[] args) {
        CharQueueImpl queue = new CharQueueImpl();
        char a = 'a';
        for (int i = 0; i < 10; i++) {
            queue.put(a);
            a++;
        }
        queue.printQueue(System.out);
        CharQueueImpl clone;
        clone=(CharQueueImpl)queue.clone();
        clone.put('x');
        System.out.printf("the size is 11==%d \n", clone.size());
        clone.printQueue(System.out);
        System.out.printf("the size is 11==%d \n by removing the oldest char %c now is %d", clone.size(),clone.get(),clone.size());
    }
}

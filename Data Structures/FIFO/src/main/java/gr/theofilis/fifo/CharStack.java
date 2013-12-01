package gr.theofilis.fifo;

import java.io.PrintStream;
import java.util.NoSuchElementException;

/**
 * Defines the methods for a Stack that handles char items
 * 
 * @author George Theofilis
 */
public interface CharStack {

    /**
     * @return true if the stack is empty
     */
    public boolean isEmpty();

    /**
     * push a char item to the stack
     */
    public void push(char item);

    /**
     * @return the item that was previously on top of the stack
     * @throws a NoSuchElementException if the stack is empty
     */
    public char pop() throws NoSuchElementException;

    /**
     * print the contents of the stack, starting from the item on the top of the
     * stack, to the stream given as argument. For example, to print to the
     * standard output you need to pass System.out as an argument. E.g.,
     *
     * printStack(System.out);
     */
    public void printStack(PrintStream stream);

    /**
     * @return the number of items currently in the stack (0 if it is empty)
     */
    public int size();
}
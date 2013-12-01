package gr.theofilis.fifo;

import java.io.PrintStream;

/*
 * List.java
 *
 */
// class List definition
public class List<T> implements Cloneable {

    /**
     * Το μέγεθος της λίστας.
     */
    private int size;
    /**
     * Το πρώτο στοιχείο της λίστας
     */
    private ListNode<T> first;
    /**
     * Το τελέυταιο στοιχείο της λίστας
     */
    private ListNode<T> last;
    /**
     * Το όνομα της λίστας.
     */
    private String name;

    /**
     * constructor creates an empty List with a name
     *
     * @param listName the name of the list
     */
    public List(String listName) {
        this.first = null;
        this.last = null;
        this.size = 0;
        this.name = listName;
    } // end List one-argument constructor

    /**
     * the default constructor
     */
    public List() {
        this(null);
    }

    /**
     * insert Object at front of List
     *
     * @param element
     */
    public void insertAtFront(T element) {
        //Φτιάχνω ένα καινούργιο κόμβο
        ListNode<T> node = null;
        try {
            node = new ListNode<T>(element);
        } catch (OutOfMemoryError out) {
            System.out.println("Is out of memory ");
        }
        //Ελένχω αν η λίστα είναι κενή
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;

        }
        size++;
    } // end method insertAtFront

    // insert Object at end of List
    public void insertAtBack(T element) {
        ListNode<T> node = null;
        try {
            node = new ListNode<T>(element);
        } catch (OutOfMemoryError e) {
            System.out.println("Is out of memory");
        }
        if (isEmpty()) {
            //τότε κάνω τον first και τον last node ίσο με το
            //node
            first = last = node;
        } else {
            //αλλίως κάνω τον last να δείχνει στο node
            //και τον node last.
            last.next = node;
            last = node;
        }
        size++;
    } // end method insertAtBack

    /**
     * remove first node from List
     *
     * @return
     * @throws EmptyListException if you try to remove an element from an empty
     * list.
     */
    public T removeFromFront() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException();
        }
        T temp = first.getElement();
        if (first == last) {
            first = null;
            last = null;
        } else {
            first = first.next;
        }
        size--;
        return temp;
    } // end method removeFromFront

    /**
     * remove last node from List
     *
     * @return
     * @throws EmptyListException if you try to remove an element from an empty
     * list.
     */
    public T removeFromBack() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException();
        }
        T temp = last.getElement();
        if (first == last) {
            first = null;
            last = null;
        } else {
            //Έχω μια μεταβλήτη για να δώ άν έχω φτάσει το τελευταίο στοιχειο
            ListNode<T> current = first.next;
            //Έχω άλλη μια για να θυμάται η λίστα ποίος είναι ο προτελευταίος
            ListNode<T> newlast = first;
            //Διατρέχει όλα τα στοιχεία της λίστας και σταματάει όταν βρεί τον τελευταίο.
            while (current != last) {
                //Ενημερώνει τον προτελευταίο
                newlast = newlast.next;
                //Ενημερώνει τον τελευταίο
                current = current.next;
            }
            //Κάνει τελευταίο τον προτελευταίο
            last = newlast;
            //και μετά καταστρέφει τον τελευταίο
            last.next = null;
        }
        size--;
        return temp;
    } // end method removeFromBack

    /**
     * determine whether list is empty
     *
     * @return true if the list is empty else return false;
     */
    public boolean isEmpty() {
        return first == null;
    } // end method isEmpty

    /**
     * returns the number of elements in the list.
     *
     * @return size the number of the elements.
     */
    public int size() {
        return this.size;
    }

    /**
     * output List contents
     *
     */
    public void print(PrintStream pr) {
        if (isEmpty()) {
            pr.printf("Empty %s\n", name);
            return;
        } // end if

        pr.printf("The %s is: ", name);
        ListNode current = first;

        // while not at end of list, output current node's data
        while (current != null) {
            pr.printf("%s ", current.element);
            current = current.next;
        } // end while

        pr.println("\n");
    } // end method print

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }
} // end class List


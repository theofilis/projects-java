package gr.theofilis.lifo;
/*
 * ListNode.java
 *
 */

class ListNode <T> implements Cloneable{
    // package access members; List can access these directly

    /**
     * the value of the node
     */
    protected T  element;

    /**
     * refers to the next node
     */
    protected ListNode next;

    /**
     * constructor creates a ListNode that refers to object
     *
     * @param element the value of  the node
     */
    ListNode(T element) {
        this(element, null);
    } // end ListNode one-argument constructor

    /**
     * constructor creates ListNode that refers to
     * Object and to next ListNode
     * @param element the value of the node
     * @param node the next node
     */
    ListNode(T element, ListNode node) {
        this.element = element;
        this.next = node;

    } // end ListNode two-argument constructor

    /**
     * return reference to data in node
     *
     * @return the element of the node
     */
    T getElement() { // return Object in this node
        return this.element;
    } // end method getObject

    /**
     *return reference to next node in list
     *@return the next node in the list
     */
    ListNode getNext() { // get next node
        return this.next;
    } // end method getNext

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
} // end class ListNode


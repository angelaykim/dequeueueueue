/*****************************************************
 * interface Deque
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 ******************************************************/

import java.util.Iterator;

public interface Deque<T> extends Iterable<T>{

    //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~

    

    // toString
    public String toString();

    // returns whether deque is empty.
    public boolean isEmpty();

    // size
    public int size();

    // adds to the tail
    public boolean add( T t );

    // sets t to the head, points to old head.
    public void addFirst( T t );

    // adds to the tail
    public void addLast( T t );

    // returns the first element of the deque without dequeuing it.
    public T peekFirst();

    // returns the last element of the deque without dequeuing it.
    public T peekLast();

    // retrieves and removes, returns null if deque is empty.
    public T pollFirst();
    public T pollLast();
    

    // iterators
    Iterator<T> iterator();
    Iterator<T> descendingIterator();
    /* ==================================================
    =================================================== */

    //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~


}//end interface Queue                                                                                           

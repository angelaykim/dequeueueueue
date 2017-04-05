// Team dequeueueueueue - Theodore Peters, Eric Chen, Angela Kim
// APCS2 pd4
// lab02
// 2017-04-05

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deck<T> implements Deque<T> {

    private DLLNode<T> _head, _tail;
    private int _size;

    public Deck() {
	_size = 0;
	_head = _tail = null;
    }

    // Uses addLast() method, returns true.
    public boolean add( T t ) {
	addLast( t );
	return true;
    }

    // Adds a node to the front of deque, increments size.
    public void addFirst( T t ) {
	// If the deque is empty,
	if ( isEmpty() ) {
	    _head = _tail = new DLLNode<T>( t, null, null );
	}
	// Otherwise,
	else {
	    DLLNode<T> tmp = new DLLNode<T>( t, _head, null );
	    _head.setPrev( tmp );
	    _head = tmp;
	}
	_size++;
    }

    // Adds a node to the end of the deque, decrements size.
    public void addLast( T t ) {
	if ( isEmpty() )
	    _head = _tail = new DLLNode<T>( t, null, null );
	else {
	    _tail.setNext( new DLLNode<T>( t, null, _tail ) );
	    _tail = _tail.getNext();
	}
	_size++;
    }

    // Returns first item in deque.
    public T peekFirst() {
	return _head.getCargo();
    }

    // Returns last item in deque.
    public T peekLast() {
	return _tail.getCargo();
    }

    // Removes first item, returns it.
    public T pollFirst() {
	T tmp = _head.getCargo();
	_head = _head.getNext();
	_head.setPrev( null );
	_size--;
	return tmp;
    }

    // Removes last item, returns it.
    public T pollLast() {
	T tmp = _tail.getCargo();
	_tail = _tail.getPrev();
	_tail.setNext( null );
	_size--;
	return tmp;
    }

    // Returns true if deque is empty, false otherwise.
    public boolean isEmpty() {
	return _size == 0;
    }

    // Returns the size of deque.
    public int size() {
	return _size;
    }

    public String toString() {
	String retStr = "";
	DLLNode<T> temp = _head;
	while ( temp != null ) {
	    retStr += temp.toString() + " ";
	    temp = temp.getNext();
	}
	return retStr;
    }
    public Iterator<T> iterator() {
	return new MyIterator( true );
    }
    public Iterator<T> descendingIterator() {
	return new MyIterator( false );
    }
    private class MyIterator implements Iterator<T> {
	private DLLNode<T> _doofy;
	private boolean _forward;
	public MyIterator( boolean f ) {
	    _forward = f;
	    if ( f )
		_doofy = new DLLNode<T>( null, _head, null );
	    else
		_doofy = new DLLNode<T>( null, null, _tail );
	}
	public boolean hasNext() {
	    if ( _forward )
		return _doofy.getNext() != null;
	    else
		return _doofy.getPrev() != null;
	}
	public T next() {
	    if ( !hasNext() )
		throw new NoSuchElementException();
	    if ( _forward )
		_doofy = _doofy.getNext();
	    else
		_doofy = _doofy.getPrev();
	    return _doofy.getCargo();
	}
	public void remove() {
	    throw new UnsupportedOperationException();
	}
    }
    public static void main( String args[] ) {
	Deck<String> dock = new Deck<String>();
	dock.add("friends");
	dock.addFirst("hello");
	dock.addLast("and");
	dock.add("compatriots");
	dock.add("guacamole");
	dock.pollLast();
	System.out.println(dock + "\n\nIteration:\n");
	for(String igloo : dock)
	    System.out.println(igloo);
	
	Iterator<String> otters = dock.descendingIterator();
	while(otters.hasNext())
	    System.out.println(otters.next());
    }
}

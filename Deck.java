public class Deck<T> implements Deque {

    private DLLNode<T> _head, _tail;
    private int _size;

    public Deck() {
	_size = 0;
	_head = _tail = null;
    }

    public boolean add(T t) {
	addLast(t);
	return true;
    }

    public void addFirst( T t ) {
	if ( isEmpty() ) {
	    _head = _tail = new DLLNode<T>( t, null, null );
	}
	else {
	    DLLNode<T> tmp = new DLLNode<T>( t, _head, null );
	    _head.setPrev( tmp );
	    _head = tmp;
	}
	_size++;
    }

    public void addLast(T t) {
	if(isEmpty())
	    _head = _tail = new DLLNode<T>(t, null, null);
	else {
	    _tail.setNext(new DLLNode<T>(t, null, _tail));
	    _tail = _tail.getNext();
	}
	_size++;
    }

    public T peekFirst() {
	return _head.getCargo();
    }

    public T peekLast() {
	return _tail.getCargo();
    }

    public T pollFirst() {
	T tmp = _head.getCargo();
	_head = _head.getNext();
	_head.setPrev( null );
	_size--;
	return tmp;
    }

    public T pollLast() {
	T tmp = _tail.getCargo();
	_tail = _tail.getPrev();
	_tail.setNext( null );
	_size--;
	return tmp;
    }
	
    public boolean isEmpty() {
	return _size==0;
    }

    public int size() {
	return _size;
    }

    public String toString() {
	String retStr = "";
	DLLNode<T> temp = _head;
	while (temp!=null) {
	    retStr+=temp.toString() + " ";
	    temp = temp.getNext();
	}
	return retStr;
    }

    public static void main(String args[]) {
	Deck<String> dock = new Deck<String>();
	dock.add("hello");
	dock.add("friends");
	dock.add("and");
	dock.add("compatriots");
	System.out.println(dock);
    }
}

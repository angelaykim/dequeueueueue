public class DLLNode<T> {

    private T _cargo;    //cargo may only be of type String
    private DLLNode<T> _nextNode; //pointer to next LLNode
    private DLLNode<T> _prevNode;
    // constructor -- initializes instance vars
    public DLLNode( T value, DLLNode<T> next, DLLNode<T> prev ) {
	_cargo = value;
	_nextNode = next;
	_prevNode = prev;
    }


    //--------------v  ACCESSORS  v--------------
    public T getCargo() { return _cargo; }

    public DLLNode<T> getNext() { return _nextNode; }

    public DLLNode<T> getPrev() { return _prevNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setCargo( T newCargo ) {
	T c = _cargo;
	_cargo = newCargo;
	return c;
    }
    
    public DLLNode<T> setNext( DLLNode<T> newNext ) {
	DLLNode<T> n = _nextNode;
	_nextNode = newNext;
	return n;
    }
    public DLLNode<T> setPrev( DLLNode<T> newPrev ) {
	DLLNode<T> p = _prevNode;
	_prevNode = newPrev;
	return p;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() {
	return _cargo.toString(); }


    //main method for testing
    public static void main( String[] args ) {
    }//end main

}//end class LLNode

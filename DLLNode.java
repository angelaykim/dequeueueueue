/*Theodre Peters
APCS pd4
HW18a -- DLLNode
2017-03-16*/
/*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 *****************************************************/

public class DLLNode {

    private String _cargo;    //cargo may only be of type String
    private DLLNode _nextNode; //pointer to next LLNode
    private DLLNode _prevNode;
    // constructor -- initializes instance vars
    public DLLNode( String value, DLLNode next, DLLNode prev ) {
	_cargo = value;
	_nextNode = next;
	_prevNode = prev;
    }


    //--------------v  ACCESSORS  v--------------
    public String getCargo() { return _cargo; }

    public DLLNode getNext() { return _nextNode; }

    public DLLNode getPrev() { return _prevNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo ) {
	String ccc = _cargo;
	_cargo = newCargo;
	return ccc;
    }
    
    public DLLNode setNext( DLLNode newNext ) {
	DLLNode nerd = _nextNode;
	_nextNode = newNext;
	return nerd;
    }
    public DLLNode setPrev( DLLNode newPrev ) {
	DLLNode perv = _prevNode;
	_prevNode = newPrev;
	return perv;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() {
	return _cargo.toString(); }


    //main method for testing
    public static void main( String[] args ) {
    }//end main

}//end class LLNode

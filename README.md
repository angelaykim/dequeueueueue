# dequeueueueue
*Roster: Theodore Peters, Eric Chen, Angela Kim</p>

<h1>Method Selection Choices</h1>

<h2>Chosen Methods</h2>
* 'public String toString();'
* 'public boolean isEmpty();'
* 'public int size();'
* 'public boolean add( T t );'
* 'public void addFirst( T t );'
* 'public void addLast( T t );'
* 'public T peekFirst();'
* 'public T peekLast();'
* 'public T pollFirst();'
* 'public T pollLast();'

<p>We decided to prioritize our methods based on how fundamental they are and how familiar we are with them.  The reason for this is so we don't have to deal with figuring out the algorithm for a completely new method until we've fine-tuned the original ones, and so we can use the more fundamental methods in more complex methods to be developed later.</p>

<h1>Rationale for Choosing Doubly-Linked Node</h1>
<p>We chose to use a doubly-linked node for its constant runtime as pertains to elements at either the extreme beginning or end of a linked list, which are the only two locations accessed by Deque in most methods (excluding toString and iteration).</p>

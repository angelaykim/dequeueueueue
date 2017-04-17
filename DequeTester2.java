public class DequeTester2{
    public static void main( String[] args){
	Deque<String> tester= new Deck<String>();
	
	tester.addFirst("jo");
	System.out.println(tester);
	//jo
	
	tester.addFirst("I'm");
	System.out.println(tester);
	//I'm jo

	tester.addFirst("Hi");
	System.out.println(tester);
	//Hi I'm jo
	
	tester.addLast(". Nice");
	System.out.println(tester);
	//Hi I'm jo. Nice
	
	tester.addLast("to");
	System.out.println(tester);
	//Hi I'm jo. Nice to
	
	tester.addLast("meet");
	System.out.println(tester);
	//Hi I'm jo. Nice to meet
	
	tester.addLast("you");
	System.out.println(tester);
	//Hi i'm jo. Nice to meet you.
	
	System.out.println("\ntesting pollLast() now:");
	System.out.println(tester.pollLast());
	//you
	
	System.out.println("\ntesting pollFirst() now:");
	System.out.println(tester.pollFirst());
	//Hi
	
	System.out.println("\ntesting peekFirst() now:");
	System.out.println(tester.peekFirst());
	//I'm
	
	System.out.println("\ntesting peekLast() now:");
	System.out.println(tester.peekLast());
	//meet

	System.out.println("\nWhat's left: " + tester);

	System.out.println("\nIsEmpty? " + tester.isEmpty());
	//false
	
	System.out.println("\nRemoving everything...");
	tester.pollLast();
	tester.pollFirst();
	tester.pollLast();
	tester.pollFirst();
	tester.pollLast();
	
	System.out.println("SIZE: " + tester.size());
	//0

	System.out.println("\nIsEmpty? " + tester.isEmpty());
	//true
	
	System.out.println("\nRemoving when nothing is there ...");
	System.out.println(tester.pollLast());
	//null
	System.out.println(tester.pollFirst());
	//null
	System.out.println(tester.peekFirst());
	//null
	System.out.println(tester.peekLast());
	//null
    }
}

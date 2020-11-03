package list.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList numbers = new LinkedList();
		
		
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addFirst(5);
		numbers.add(1, 15);
		
		
		System.out.println( numbers.removeLast() );
		System.out.println( numbers.size() );
		System.out.println( numbers.get(2) );
		System.out.println( numbers ); 
		System.out.println(numbers.indexOf(5));
	}
	
	
	

}

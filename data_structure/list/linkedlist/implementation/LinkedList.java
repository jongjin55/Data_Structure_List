package list.linkedlist.implementation;

public class LinkedList {

	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node {
		private Object data;
		private Node next;
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		//값을 보기 위해 출력 메소드
		public String toString() {
			return String.valueOf(this.data);
		}
	}
}

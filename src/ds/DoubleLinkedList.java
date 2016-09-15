package ds;

public class DoubleLinkedList {

	Node firstNode = null;
	Node lastNode = null;
	int totalNodes = 0;

	public DoubleLinkedList() {

	}

	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		list.display();

		list.insertFirst(10);
		list.insertFirst(23);
		list.insertFirst(44);

		list.display();
		System.out.println(list.firstNode);
		System.out.println(list.lastNode);
		
		list.removeFirst();
		System.out.println(list.firstNode);
		System.out.println(list.lastNode);
		
		list.removeFirst();
		System.out.println(list.firstNode);
		System.out.println(list.lastNode);
		
		list.removeFirst();
		System.out.println(list.firstNode);
		System.out.println(list.lastNode);

		list.displayReverse();

	}

	public void insertFirst(int key) {
		Node node = new Node(key);
		totalNodes++;
		if (firstNode == null) {
			firstNode = node;
			lastNode = node;
		} else {

			firstNode.prev = node;
			node.next = firstNode;
			firstNode = node;
		}
	}

	public void removeFirst() {
		if (totalNodes == 0) {
			System.out.println("Empty List");
			return;
		}
		totalNodes--;
		System.out.println("Removing " + firstNode);
		firstNode = firstNode.next;
		if (firstNode != null)
			firstNode.prev = null;
		else
			lastNode = null;

	}

	public void display() {
		if (totalNodes == 0) {
			System.out.println("Empty List");
			return;
		}
		Node focusNode = firstNode;
		while (focusNode != null) {
			System.out.print(focusNode);
			System.out.print(" -> ");
			focusNode = focusNode.next;
		}
		System.out.print(" null");
		System.out.println();
	}

	public void displayReverse() {
		if (totalNodes == 0) {
			System.out.println("Empty List");
			return;
		}
		Node focusNode = lastNode;
		while (focusNode != null) {
			System.out.println(focusNode);
			System.out.println("Next Link " + focusNode.prev);
			System.out.println("Prev Link " + focusNode.next);
			
			System.out.println();
			focusNode = focusNode.prev;
		}
	}

	class Node {

		int key;
		Node prev;
		Node next;

		public Node(int key) {
			this.key = key;
		}

		@Override
		public String toString() {
			return "[" + key + "]";
		}

	}

}

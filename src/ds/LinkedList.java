package ds;

public class LinkedList {

	Link firstLink;

	public LinkedList() {
		firstLink = null;
	}

	public boolean isEmpty() {
		return firstLink == null;
	}

	public void insert(String author, String book, int price) {
		Link link = new Link(author, book, price);
		link.next = firstLink;
		firstLink = link;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("No Data Available");
			return;
		}
		Link current = firstLink;
		while (current != null) {
			current.display();
			System.out.print(" --> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insert("Chetan bhagat", "half girl", 300);
		list.insert("Shiv khera", "Win urslef", 100);
		list.insert("Russel", "Quantico", 150);
		list.insert("Amay", "Shiva", 500);

		list.display();
		list.remove("Russel");
		list.display();
		

	}

	public void removeFirst() {
		if (isEmpty()) {
			System.out.println("List is empty now !!!");
		} else {
			System.out.println("Removed: " + firstLink.author);
			firstLink = firstLink.next;
		}
	}

	public Link remove(String author) {
		Link prevLink = firstLink;
		Link currLink = firstLink;

		if (isEmpty()) {
			System.out.println("List is empty now !!!");
			return null;
		}

		while (currLink != null) {

			if (currLink.author != author) {

				if (currLink.next == null) {
					System.out.println("No match found !!!");
					return null;
				}

				prevLink = currLink;
				currLink = currLink.next;
			} else {
				break;
			}

		}
		if (currLink == firstLink) {
			firstLink = firstLink.next;
		} else {
			prevLink.next = currLink.next;
		}
		System.out.println("Removing "+currLink.author);
		return currLink;
	}

	class Link {
		public String author;
		public String book;
		public int price;

		public Link next;

		public Link(String author, String book, int price) {
			super();
			this.author = author;
			this.book = book;
			this.price = price;
		}

		public void display() {
			System.out.print(author);
		}

		@Override
		public String toString() {
			return author;
		}

	}

}

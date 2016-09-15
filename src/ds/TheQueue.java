package ds;

import java.util.Arrays;

public class TheQueue {

	private String[] theQueue;
	private int size;
	private int front, rear, items = 0;

	public TheQueue(int size) {
		this.size = size;
		theQueue = new String[size];
		Arrays.fill(theQueue, "-1");
	}

	public static void main(String[] args) {
		TheQueue queue = new TheQueue(13);
		queue.insert("10");
		queue.insert("13");
		queue.insert("12");
		queue.insert("11");
		queue.displayTheQueue();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.displayTheQueue();

	}

	public void insert(String input) {

		if (items + 1 < size) {
			theQueue[rear] = input;
			items++;
			rear++;
		} else {
			System.out.println("No Space found");
		}

	}

	public void remove() {
		if (items > 0) {
			theQueue[front] = "-1";
			front++;
			items--;
		} else {
			System.out.println("Empty Queue !!");
		}
	}

	public void displayTheQueue() {
		for (int n = 0; n < 6 * size + 2; n++)
			System.out.print("-");
		System.out.println();
		for (int n = 0; n < size; n++) {
			System.out.format("| %2s " + " ", n);
		}
		System.out.println("|");
		for (int n = 0; n < 6 * size + 2; n++)
			System.out.print("-");
		System.out.println();
		for (int n = 0; n < size; n++) {
			if (theQueue[n].equals("-1"))
				System.out.print("|     ");
			else
				System.out.print(String.format("| %2s " + " ", theQueue[n]));
		}
		System.out.println("|");
		for (int n = 0; n < 6 * size + 2; n++)
			System.out.print("-");
		System.out.println();
		// Number of spaces to put before the F
		int spacesBeforeFront = 3 * (2 * (front + 1) - 1);
		for (int k = 1; k < spacesBeforeFront; k++)
			System.out.print(" ");
		System.out.print("F");
		// Number of spaces to put before the R
		int spacesBeforeRear = (2 * (3 * rear) - 1) - (spacesBeforeFront);
		for (int l = 0; l < spacesBeforeRear; l++)
			System.out.print(" ");
		System.out.print("R");
		System.out.println("\n");
	}

}

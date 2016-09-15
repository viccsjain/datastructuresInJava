package ds;
import java.util.Arrays;

public class TheStack {

	private String[] stackArray;
	private int stackSize;
	private int topOfStack = -1;

	public TheStack(int size) {
		stackSize = size;
		stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
	}

	public static void main(String[] args) {
		TheStack stack = new TheStack(10);

		stack.push("10");
		stack.push("11");
		stack.push("13");
		stack.push("10");
		stack.push("11");
		stack.push("13");
		stack.push("10");
		stack.push("11");
		stack.push("13");
		stack.push("10");
		stack.pop();
		stack.push("11");
		stack.pop();
		stack.push("13");
	}

	public String pop() {
		if (topOfStack >= 0) {
			String val = stackArray[topOfStack];
			stackArray[topOfStack] = "-1";
			topOfStack--;
			System.out.println("POP "+val);
			return val;
		}
		return "-1";
	}

	public void push(String input) {
		if (topOfStack + 1 < stackSize) {
			topOfStack++;
			stackArray[topOfStack] = input;
			displayStack();
			System.out.println("PUSH " + input + " completed");
		} else {

			System.out.println("No Space available");
			displayStack();

		}
	}

	public void displayStack() {
		for (int i = 0; i < 52; i++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < stackSize; i++) {
			System.out.print(" | ");
			System.out.print("" + i + " ");
		}
		System.out.println(" |");

		for (int i = 0; i < 52; i++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < stackSize; i++) {
			System.out.print(" | ");
			if (!stackArray[i].equals("-1"))
				System.out.print(stackArray[i]);
			else
				System.out.print("  ");
		}
		System.out.println(" |");

		for (int i = 0; i < 52; i++)
			System.out.print("-");
		System.out.println();
	}

}

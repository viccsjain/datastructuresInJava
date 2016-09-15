import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class isFibo {

	static List<Long> list = new ArrayList<>();
	static {
		list.add(0L);
		list.add(1L);
		list.add(1L);
		list.add(2L);
		list.add(3L);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		long input;
		for (int i = 0; i < testCases; i++) {
			input = in.nextLong();
			isFibo(input);
		}

	}

	public static void isFibo(long n) {
		if (list.contains(n)) {
			System.out.println("IsFibo");
			return;
		} else {
			if (list.get(list.size() - 1) > n) {
				System.out.println("IsNotFibo");
			} else {
				boolean isFound = false;
				long prev = list.get(list.size() - 2);
				long current = list.get(list.size() - 1);
				long val;
				do {
					val = prev + current;
					if (val == n) {
						isFound = true;
						break;
					}
					list.add(val);
					prev = current;
					current = val;

				} while (val <= n);

				if (isFound)
					System.out.println("IsFibo");
				else
					System.out.println("IsNotFibo");
			}

		}

	}

}

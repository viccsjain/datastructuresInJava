import java.util.Scanner;

public class PallindromicRevenge {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		for (int i = 0; i < testcases; i++) {
			String input = in.next();
			char[] arr = input.toCharArray();
			int count = 0;
			for (int j = 0; j < arr.length / 2; j++) {
				count += Math.abs((int) arr[j] - (int) arr[arr.length - 1 - j]);
			}
			System.out.println(count);
		}

	}

}

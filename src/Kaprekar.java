import java.util.Scanner;

public class Kaprekar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int first = in.nextInt();
		int last = in.nextInt();
		int mod, temp, dividend = 10;
		boolean isFound = false;
		for (int i = first; i <= last; i++) {
			if (i == 1) {
				isFound = true;
				System.out.println(1);
			}
			{
				int sq = i * i;
				dividend = 10;
				while (sq / dividend > 0) {
					mod = sq % dividend;
					temp = sq / dividend;
					dividend *= 10;
					if (mod + temp == i && temp > 0 && mod > 0 ) {
						isFound = true;
						System.out.println(i);
						break;
					}
				}
			}

		}
		if (!isFound)
			System.out.println("INVALID RANGE");

	}

}

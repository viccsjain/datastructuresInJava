package Hackerank;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Pangrams {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String pangram = in.nextLine();
		char[] arr = pangram.toLowerCase().toCharArray();
		Set<Character> charSet = new TreeSet<>();

		for (char c : arr) {
			int ascii = (int) c;
			System.out.println(ascii+"   "+c);
			if (ascii >= 65 && ascii < 91 || ascii >= 97 && ascii <= 122)
				charSet.add(c);
		}
		System.out.println(charSet.size());
		if (charSet.size() == 26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}

}

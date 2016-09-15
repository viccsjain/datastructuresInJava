package Hackerank;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] arr = s.toCharArray();
		int count = 1;
		for(char c:arr){
			if((int)c < 97)
				count++;
		}
		System.out.println(count);
	}

}

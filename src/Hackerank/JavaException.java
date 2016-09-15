package Hackerank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaException {

	public static void main(String[] args) {
		JavaException e = new JavaException();
		e.m();

	}

	public void m() {
		o();
	}

	public void o() {
		n();
	}

	public void n() {
		throw new Temp();
	}

	class Temp extends ArithmeticException {

		@Override
		public String getLocalizedMessage() {
			// TODO Auto-generated method stub
			return super.getLocalizedMessage();
		}

		public Temp() {
			// TODO Auto-generated constructor stub
		}

	}

}

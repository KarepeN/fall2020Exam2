package karepe_exam2.question8;

public class One {
	private int a;

	public One(int in) {
		a = in;
	}

	public int guess(int x) {
		System.out.println("One guess " + x);
		return a + x;
	}

	public int apply(int x) {
		System.out.println("One guess " + x);
		return guess(x + 3);
	}
}

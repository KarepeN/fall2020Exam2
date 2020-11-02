package karepe_exam2.question8;

public class Two extends One {
	public Two() {
		super(11);
	}

	@Override
	public int guess(int x) {
		System.out.println("Two guess " + x);
		return super.guess(x) + 10;
	}

} // end class Two

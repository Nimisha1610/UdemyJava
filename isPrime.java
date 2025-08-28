package in28MinutesRestart;

public class MyNumber {
	private static int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public static boolean isPrime() {
		// 2 to num-1

		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		MyNumber number = new MyNumber(9);
		// boolean isPrime = MyNumber.isPrime();
		System.out.println("isPrime " + isPrime());
	}

}

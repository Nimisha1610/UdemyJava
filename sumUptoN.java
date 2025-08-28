package in28MinutesRestart;

public class MyNumber {
	private static int number;

	public MyNumber(int number) {
		this.number = number;
	}



	public static int sumUpToN() {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		MyNumber number = new MyNumber(6);
		

		int sum = MyNumber.sumUpToN();
		System.out.println("sumUpToN " + sum);
	}

}

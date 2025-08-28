package in28MinutesRestart;

public class MyNumber {
	private static int number;

	public MyNumber(int number) {
		this.number = number;
	}

	private static int sumOfDiv() {
		// 6 1,2,3,6 2+3=5
		int sum = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		MyNumber number = new MyNumber(6);

		int sumOfDiv = MyNumber.sumOfDiv();
		System.out.println("sumOfDiv " + sumOfDiv);
	}

}

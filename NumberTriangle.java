package in28MinutesRestart;

public class MyNumber {
	private static int number;

	public MyNumber(int number) {
		this.number = number;
	}
private void printNumberTriangle() {
		for (int i = 1; i <= number; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
		MyNumber number = new MyNumber(5);
number.printNumberTriangle();
}
}

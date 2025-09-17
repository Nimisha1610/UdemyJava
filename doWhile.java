package in28MinutesRestart;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("cude is " + (num * num * num));
			System.out.println("Enter a number: ");
			num = sc.nextInt();
		} while (num >= 0);
		System.out.println("thank you! have fun!");
	}
}

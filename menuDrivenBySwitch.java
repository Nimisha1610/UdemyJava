package in28MinutesRestart;

import java.util.Scanner;

public class switchMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number 1:");
		int n1 = sc.nextInt();
		System.out.println("The number you entered is - " + n1);
		System.out.print("Enter number 2:");
		int n2 = sc.nextInt();
		System.out.println("The number you entered is - " + n2);

		System.out.println("1 - ADD");
		System.out.println("2 - SUB");
		System.out.println("3 - MUL");
		System.out.println("4 - DIV");
		System.out.println("Choose operataion");
		System.out.println("Enter choice: ");
		int choice = sc.nextInt();

		System.out.println("Your choices are:");
		System.out.println("NUmber1: " + n1);
		System.out.println("NUmber2: " + n2);
		System.out.println("Choice: " + choice);

		// performUsingNestedIfElse(n1, n2, choice);
		performUsingSwitch(n1, n2, choice);

	}

	private static void performUsingNestedIfElse(int n1, int n2, int choice) {
		if (choice == 1) {
			int sum = n1 + n2;
			System.out.println("Sum of n1 and n2 is:" + sum);
		} else if (choice == 2) {
			int sub = n1 - n2;
			System.out.println("Diff of n1 and n2 is:" + sub);
		} else if (choice == 3) {
			int mul = n1 * n2;
			System.out.println("Product of n1 and n2 is:" + mul);
		} else if (choice == 4) {
			float div = n1 / n2;
			System.out.println("Quotient of n1 and n2 is:" + div);
		} else {
			System.out.println("Choice not available");
		}
	}

	private static void performUsingSwitch(int n1, int n2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("Sum of n1 and n2 is:" + (n1 + n2));
			break;
		case 2:
			System.out.println("Diff of n1 and n2 is:" + (n1 - n2));
			break;
		case 3:
			System.out.println("Product of n1 and n2 is:" + (n1 * n2));
			break;
		case 4:
			System.out.println("Quotient of n1 and n2 is:" + (n1 / n2));
			break;
		default:
			System.out.println("choice is unavailable");
		}

	}

}

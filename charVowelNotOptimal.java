package in28MinutesRestart;

public class MyChar {
	private char c;

	public MyChar(char c) {
		this.c = c;
	}

	public boolean isVowel() {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U') {
			return true;
		}
		return false;
	}

	public boolean isDigit() {
		if (c >= 48 || c <= 57) { // '0''9'
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if (c >= 97 || c <= 122) { // 'a''z'
			return true;
		}
		if (c >= 65 || c <= 90) { // 'A''Z'
			return true;
		}
		return false;
	}

	public static void printLowerCaseAlp() {
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c);
		}
	}

	public static void printUpperCaseAlpa() {
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c);
		}
	}

	public boolean isConsonant() {
		// TODO Auto-generated method stub
		if (isAlphabet() && !isVowel()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		MyChar myChar = new MyChar('c');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonant());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		MyChar.printLowerCaseAlp();
		MyChar.printUpperCaseAlpa();

	}
}

package in28MinutesRestart;

public class book {
	private int noOfCopies;

	book(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	int getnoc() {
		return noOfCopies;
	}

	void increaseNoc(int howMuch) {
		this.noOfCopies += howMuch;
	}

	void bookDetails() {
		System.out.println("book");
	}

	public static void main(String[] args) {
		book cleanCode = new book(20);

		cleanCode.bookDetails();

		// cleanCode.setnoc(20);
		System.out.println("copies :" + cleanCode.getnoc());
		cleanCode.increaseNoc(40);
		System.out.println("updated copies: " + cleanCode.getnoc());

	}

}

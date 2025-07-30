package in28MinutesRestart;

public class book {
	private int noOfCopies;

	void setnoc(int noOfCopies) {
		if(noOfCopies>0)
		this.noOfCopies = noOfCopies;
	}

	int getnoc() {
		return noOfCopies;
	}

	void increaseNoc(int howMuch) {
		setnoc(this.noOfCopies + howMuch);//if applies here
	}

	void bookDetails() {
		System.out.println("book");
	}

	public static void main(String[] args) {
		book cleanCode = new book();

		cleanCode.bookDetails();

		cleanCode.setnoc(20);
		System.out.println(cleanCode.getnoc());
		cleanCode.increaseNoc(40);
		System.out.println(cleanCode.getnoc());

	}

}

package in28MinutesRestart;

public class whileLoop {
	private int limit;

	whileLoop(int limit) {
		this.limit = limit;
	}

	private void printSquaresUptoLimit() {
		// for limit 30 op=1 4 9 16 25
		int i = 1;
		while (i * i < limit) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();
	}

	private void printCubesUptoLimit() {
		int i = 1;
		while (i * i * i < limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
	}

	public static void main(String[] args) {
		whileLoop number = new whileLoop(30);

		number.printSquaresUptoLimit();

		number.printCubesUptoLimit();
	}

}

package in28MinutesRestart;

public class motorBike {// class

	// state
	private int speed;// member variable

	motorBike() {// no argument constructor
		this(5);
	}

	motorBike(int speed) {// parameterized
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void increaseSpeed(int howMuch) {
		this.speed += howMuch;
	}

	// public void decreaseSpeed(int howMuch) {
	// motorBike(this.speed - howMuch);

	// }

	void start() {// behaviour
		System.out.println("BIKE running");
	}

	public static void main(String[] args) {

		motorBike pulsar = new motorBike(100);// object
		motorBike bullet = new motorBike(200);
		motorBike bul = new motorBike();
		pulsar.start();
		bullet.start();

		// pulsar.setSpeed(100);

		System.out.println(pulsar.getSpeed());

		// bullet.setSpeed(80);
		bullet.increaseSpeed(100);
		System.out.println(bullet.getSpeed());
		System.out.println(bul.getSpeed());

	}
}

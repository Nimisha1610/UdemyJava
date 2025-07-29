package in28MinutesRestart;

public class motorBike {// class

	// state
	private int speed;// member variable

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
			// System.out.println(speed);// 100
			// System.out.println(this.speed);// 0 default no value set
		}
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	void start() {// behaviour
		System.out.println("BIKE running");
	}

	public static void main(String[] args) {

		motorBike pulsar = new motorBike();// object
		motorBike bullet = new motorBike();

		pulsar.start();
		bullet.start();

		pulsar.setSpeed(100);
		pulsar.increaseSpeed(100);
		System.out.println(pulsar.getSpeed());
		// bullet.setSpeed(80);
		// System.out.println(bullet.getSpeed());

	}
}

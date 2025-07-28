package in28MinutesRestart;
//encapsulation
public class motorBike {// class

	// state
	private int speed;// instance variable

	void setSpeed(int spe) {// local variable
		this.speed = spe;

	}

	void start() {// behaviour
		System.out.println("BIKE is at " + speed + " kmph");

	}

	public static void main(String[] args) {

		motorBike pulsar = new motorBike();// object
		motorBike bullet = new motorBike();

		pulsar.setSpeed(100);
		bullet.setSpeed(80);
		pulsar.start();
		bullet.start();

	}

}

package in28MinutesRestart;

public class motorBike {// class
	int speed;// state

	void start() {// behaviour

		System.out.println("bike started at " + speed + " kmph");

	}

	public static void main(String[] args) {

		motorBike pulsar = new motorBike();//object
		motorBike bullet = new motorBike();

		pulsar.speed = 10;
		bullet.speed = 20;
		pulsar.start();
		bullet.start();

	}

}

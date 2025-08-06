package in28MinutesRestart;

public class switchExercise {

	public static void main(String[] args) {
		System.out.println(isWeekDay(4));
		System.out.println(determineNameOfDay(1));
	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "friday";
		case 6:
			return "Saturday";
		}
		return "Invalid";

	}

	public static String isWeekDay(int dayNumber) {

		switch (dayNumber) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return "weekday";
		}
		return "weekend";

	}
}

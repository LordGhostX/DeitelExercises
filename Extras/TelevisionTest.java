public class TelevisionTest {
	public static void main(String[] args) {
		Television television = new Television("LG", 50, "black");

		System.out.printf("Is the television on: %s%n", television.isOn());
		television.turnOnOrOff();
		System.out.printf("Is the television on: %s%n", television.isOn());
	
		System.out.printf("Current television channel: %s%n", television.getCurrentChannel());
		television.changeChannel(-10);
		System.out.printf("Current television channel: %s%n", television.getCurrentChannel());	
		television.changeChannel(5);
		System.out.printf("Current television channel: %s%n", television.getCurrentChannel());
		television.previousChannel();
		System.out.printf("Current television channel: %s%n", television.getCurrentChannel());
		television.nextChannel();
		television.nextChannel();
		System.out.printf("Current television channel: %s%n", television.getCurrentChannel());

		System.out.printf("Current television volume: %s%n", television.getVolume());
		television.increaseVolume();
		television.increaseVolume();
		television.increaseVolume();
		System.out.printf("Current television volume: %s%n", television.getVolume());
		television.decreaseVolume();
		System.out.printf("Current television volume: %s%n", television.getVolume());
	}
}
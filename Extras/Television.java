public class Television {
	private String name;
	private double size;
	private String color;
	private boolean isOn = false;
	private int currentChannel = 1;
	private int volume = 0;

	public Television(String name, double size, String color) {
		this.name = name;
		this.size = size;
		this.color = color;
	}

	public boolean isOn() {
		return isOn;
	}

	public void turnOnOrOff() {
		if (isOn == true) {
			isOn = false;
		}
		if (isOn == false) {
			isOn = true;
		}
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public void changeChannel(int channel) {
		if (channel > 0 && channel <= 100 && isOn == true) {
			currentChannel = channel;
		}
	}

	public void previousChannel() {
		if (currentChannel > 1 && isOn == true) {
			currentChannel--;
		}
	}

	public void nextChannel() {
		if (currentChannel < 100 && isOn == true) {
			currentChannel++;
		}
	}

	public int getVolume() {
		return volume;
	}

	public void increaseVolume() {
		if (volume < 100 && isOn == true) {
			volume++;
		}
	}

	public void decreaseVolume() {
		if (volume > 1 && isOn == true) {
			volume--;
		}
	}
}
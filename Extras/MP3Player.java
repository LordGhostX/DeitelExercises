public class MP3Player {
	private String name;
	private boolean isOn;
	private int volume;
	private boolean isPlaying;
	private int totalSongs;
	private int currentPlayingSong = 1;

	public MP3Player(String name, int totalSongs) {
		this.name = name;
		if (totalSongs > 1) {
			this.totalSongs = totalSongs;
		} else {
			this.totalSongs = 1;
		}
	}

	public String getName() {
		if (isOn == true) {
			return this.name;
		} else {
			return "";
		}
	}

	public boolean checkIsOn() {
		return isOn;
	}
	
	public void turnOnOrOff() {
		if (isOn == true) {
			isOn = false;
		} else {
			isOn = true;
		}
	}

	public int getVolume() {
		if (isOn == true) {
			return volume;
		} else {
			return 0;
		}
	}

	public void increaseVolume() {
		if (isOn == true && volume < 100) {
			volume++;
		}
	}

	public void decreaseVolume() {
		if (isOn == true && volume > 0) {
			volume--;
		}
	}

	public boolean checkIsPlaying() {
		return isPlaying;
	}

	public void pauseOrPlay() {
		if (isOn == true) {
			if (isPlaying == true) {
				isPlaying = false;
			} else {
				isPlaying = true;
			}
		}
	}

	public int getCurrentSong() {
		if (isOn == true){
			return currentPlayingSong;
		} else {
			return 0;
		}
	}

	public void previousSong() {
		if (isOn == true && currentPlayingSong != 1) {
			currentPlayingSong--;
		}
	}

	public void nextSong() {
		if (isOn == true && currentPlayingSong != totalSongs) {
			currentPlayingSong++;
		}
	}

	public int getTotalSongs() {
		if (isOn == true){
			return totalSongs;
		} else {
			return 0;
		}
	}

	public void addSong() {
		if (isOn == true) {
			totalSongs++;
		}
	}

	public void removeSong() {
		if (isOn == true && totalSongs > 1) {
			totalSongs--;
		}
	}

	public void changeSong(int song) {
		if (isOn == true && song >= 1 && song <= totalSongs) {
			currentPlayingSong = song;
		}
	}	
}
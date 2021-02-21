public class MP3PlayerTest {
	public static void main(String[] args) {
		MP3Player mp3Player = new MP3Player("Samsung", 10);

		System.out.println("Is MP3Player On: " + mp3Player.checkIsOn());
		mp3Player.turnOnOrOff();
		System.out.println("Is MP3Player On: " + mp3Player.checkIsOn());

		System.out.println("MP3Player Name: " + mp3Player.getName());

		System.out.println("MP3Player Volume: " + mp3Player.getVolume());
		mp3Player.increaseVolume();
		mp3Player.increaseVolume();
		System.out.println("MP3Player Volume: " + mp3Player.getVolume());
		mp3Player.decreaseVolume();
		System.out.println("MP3Player Volume: " + mp3Player.getVolume());

		System.out.println("Is MP3Player Playing: " + mp3Player.checkIsPlaying());
		mp3Player.pauseOrPlay();
		System.out.println("Is MP3Player Playing: " + mp3Player.checkIsPlaying());

		System.out.println("Current Playing Song: " + mp3Player.getCurrentSong());
		mp3Player.nextSong();
		mp3Player.nextSong();
		System.out.println("Current Playing Song: " + mp3Player.getCurrentSong());
		mp3Player.previousSong();
		System.out.println("Current Playing Song: " + mp3Player.getCurrentSong());
		mp3Player.changeSong(5);
		System.out.println("Current Playing Song: " + mp3Player.getCurrentSong());

		System.out.println("Total Songs: " + mp3Player.getTotalSongs());
		mp3Player.addSong();
		mp3Player.addSong();
		System.out.println("Total Songs: " + mp3Player.getTotalSongs());
		mp3Player.removeSong();
		System.out.println("Total Songs: " + mp3Player.getTotalSongs());
	}
}
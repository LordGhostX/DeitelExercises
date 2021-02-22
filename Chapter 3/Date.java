public class Date {
	//you are to initialize here
	private int month = 2;
	private int day = 3;
	private int year = 2009;

	//you do not need an extra method to initialize


	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public String displayDate() {
		return month + "/" + day + "/" + year;
	}
}


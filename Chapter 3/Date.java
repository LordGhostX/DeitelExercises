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

//I added a class here so prevent creating a class outside this file
class DateTest {
	public static void main(String[] args) {
		com.danielsumah.Date date = new com.danielsumah.Date();

		//display the defaults
		System.out.println("Default date is : ");
		System.out.println(date.displayDate());

		//set new values
		date.setDay(22);
		date.setMonth(2);
		date.setYear(2021);
		//display new date
		System.out.println("Current date is : ");
		System.out.println(date.displayDate());

	}
}
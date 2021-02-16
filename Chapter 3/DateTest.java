public class DateTest {
	public static void main(String[] args) {
		Date date = new Date(3, 23, 2002);
		
		System.out.println(date.getMonth());
		System.out.println(date.getDay());
		System.out.println(date.getYear());
		System.out.println(date.displayDate());

		date.setMonth(2);
		date.setDay(16);
		date.setYear(2021);

		System.out.println(date.displayDate());
	}
}
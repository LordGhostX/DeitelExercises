public class EmployeeTest {
	public static void main(String[] args) {
		Employee firstEmployee = new Employee("Chris", "James", 10000);
		Employee secondEmployee = new Employee("Bob", "John", 15000);

		firstEmployee.setFirstName("Ghost");
		System.out.println(firstEmployee.getFirstName());
		secondEmployee.setLastName("Peter");
		System.out.println(secondEmployee.getLastName());

		System.out.printf("Annual salary of first employee: %f%n", firstEmployee.getSalary() * 12);
		System.out.printf("Annual salary of second employee: %f%n", secondEmployee.getSalary() * 12);

		double firstEmployeeRaise = firstEmployee.getSalary() * 12 * 1.1;
		double secondEmployeeRaise = firstEmployee.getSalary() * 12 * 1.1;

		firstEmployee.setSalary(firstEmployeeRaise);
		secondEmployee.setSalary(secondEmployeeRaise);

		System.out.printf("Annual salary of first employee: %f%n", firstEmployee.getSalary() * 12);
		System.out.printf("Annual salary of second employee: %f%n", secondEmployee.getSalary() * 12);
	}
}

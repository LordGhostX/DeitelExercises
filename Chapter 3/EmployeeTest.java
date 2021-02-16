public class EmployeeTest {
	public static void main(String[] args) {
		Employee firstEmployee = new Employee();
		Employee secondEmployee = new Employee();

		firstEmployee.setFirstName("Chris");
		secondEmployee.setFirstName("Bob");
	
		firstEmployee.setLastName("James");
		secondEmployee.setLastName("John");

		firstEmployee.setSalary(10000);
		secondEmployee.setSalary(15000);

		System.out.printf("Annual salary of first employee: %f%n", firstEmployee.getSalary() * 12);
		System.out.printf("Annual salary of second employee: %f%n", secondEmployee.getSalary() * 12);

		double firstEmployeeRaise = ((10.0 / 100) * firstEmployee.getSalary()) + firstEmployee.getSalary();
		double secondEmployeeRaise = ((10.0 / 100) * secondEmployee.getSalary()) + secondEmployee.getSalary();

		firstEmployee.setSalary(firstEmployeeRaise);
		secondEmployee.setSalary(secondEmployeeRaise);

		System.out.printf("Annual salary of first employee: %f%n", firstEmployee.getSalary() * 12);
		System.out.printf("Annual salary of second employee: %f%n", secondEmployee.getSalary() * 12);
	}
}
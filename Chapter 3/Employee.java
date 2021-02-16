public class Employee {
	private String firstName;
	private String lastName;
	private double salary;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getSalary() {
		return salary;
	}
}
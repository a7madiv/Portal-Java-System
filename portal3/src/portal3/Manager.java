package portal3;

public class Manager extends User {

	private int managerId;
	private int experienceYear;
	private double salary;
	Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	private static int lastManagerId = 0;

	public Manager() {

	}

	public Manager(String name, int age, int phoneNumber, int experienceYear, double salary) {

		super(name, age, phoneNumber);
		setManagerId();
		setExperienceYear(experienceYear);
		setSalary(salary);

	}

	public int getManagerId() {
		return managerId;
	}

	public int getExperienceYear() {
		return experienceYear;
	}

	public double getSalary() {
		return salary;
	}

	private void setManagerId() {
		this.managerId = ++lastManagerId;
	}

	public void setExperienceYear(int experienceYear) {
		this.experienceYear = experienceYear;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	void printInfo() {

		super.printInfo();
		System.out.println("Manager Id = " + getManagerId());
		System.out.println("Experience Year = " + getExperienceYear());
		System.out.println("Salary = " + getSalary());
		System.out.println();
	}

	double calcAnnualSalary() {

		return getSalary() * 12;
	}



}

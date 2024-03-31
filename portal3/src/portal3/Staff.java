package portal3;

public class Staff extends User {

	private int staffId;
	private int experienceYear;
	private double salary;
	private static int lastStaffId = 0;

	public Staff() {

	}

	public Staff(String name, int age, int phoneNumber, int experienceYear, double salary) {

		super(name, age, phoneNumber);

		setStaffId();
		setExperienceYear(experienceYear);
		setSalary(salary);

	}

	public int getStaffId() {
		return staffId;
	}

	public int getExperienceYear() {
		return experienceYear;
	}

	public double getSalary() {
		return salary;
	}

	public void setStaffId() {
		this.staffId = ++lastStaffId;
	}

	public void setExperienceYear(int experienceYear) {
		this.experienceYear = experienceYear;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	void printInfo() {

		super.printInfo();
		System.out.println("Staff Id = " + getStaffId());
		System.out.println("Experience Year = " + getExperienceYear());
		System.out.println("Salary = " + getSalary());
		System.out.println();
	}

	double calcAnnualSalary() {

		return getSalary() * 12;
	}

}

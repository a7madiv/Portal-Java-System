package portal3;

public class Professor extends User {

	private int professorId;
	private int experienceYear;
	private double salary;
	private int load;

	private static int lastProfessorId = 0;

	public Professor() {

	}

	public Professor(String name, int age, int phoneNumber, int experienceYear, double salary, int load) {
		super(name, age, phoneNumber);

		setProfessorId();
		setExperienceYear(experienceYear);
		setSalary(salary);
		setLoad(load);
	}

	public int getProfessorId() {
		return professorId;
	}

	public int getExperienceYear() {
		return experienceYear;
	}

	public double getSalary() {
		return salary;
	}

	public int getLoad() {
		return load;
	}

	private void setProfessorId() {
		this.professorId = ++lastProfessorId;
	}

	public void setExperienceYear(int experienceYear) {
		this.experienceYear = experienceYear;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setLoad(int load) {
		this.load = load;
	}

	void printInfo() {

		super.printInfo();
		System.out.println("Professor Id = " + professorId);
		System.out.println("Experience Year = " + getExperienceYear());
		System.out.println("Salary = " + getSalary());
		System.out.println("Load = " + getLoad());

	}

	double calcAnnualSalary() {

		return getSalary() * 12;
	}
}

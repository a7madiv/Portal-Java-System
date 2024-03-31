package portal3;

public class Course {

	private int code;
	private String name;
	private int creditHours;
	private int maxEnrollment;
	private Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	private static int lastCourseCode = 0;

	public Course() {

	}

	public Course(String name, int creditHours, int maxEnrollment) {

		setCode();
		setName(name);
		setCreditHours(creditHours);
		setMaxEnrollment(maxEnrollment);

	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getCreditHours() {
		return creditHours;
	}

	public int getMaxEnrollment() {
		return maxEnrollment;
	}

	public void setCode() {
		this.code = ++lastCourseCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	public void setMaxEnrollment(int maxEnrollment) {
		this.maxEnrollment = maxEnrollment;
	}

	void printInfo() {

		System.out.println("Course Code  = " + getCode());
		System.out.println("Course Name = " + getName());
		System.out.println("Course Max Enrollment = " + getMaxEnrollment());
		System.out.println("Course Credit Hours() = " + getCreditHours());
		System.out.println();
	}

}

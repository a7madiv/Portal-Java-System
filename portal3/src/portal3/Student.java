package portal3;

public class Student extends User {

	private int studentId;
	private int secondaryGPA;
	private Department department;
	private Course courses[ ]=new Course[5];


	public Course[] getCourse() {
		return courses;
	}

	public void setCourse(Course[] course) {
		this.courses = course;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	private static int lastStudentId = 0;

	public Student() {

	}

	public Student(String name, int age, int secondaryGPA,  int phoneNumber) {

		super(name, age, phoneNumber);
		setStudentId();
		setSecondaryGPA(secondaryGPA);

	}

	private void setStudentId() {

		this.studentId = ++lastStudentId;
	}

	public void setSecondaryGPA(int secondaryGPA) {
		this.secondaryGPA = secondaryGPA;
	}


	public int getStudentId() {
		return studentId;
	}

	public int getSecondaryGPA() {
		return secondaryGPA;
	}

	

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	void printInfo() {

		super.printInfo();
		System.out.println("Student Id = " + getStudentId());
		System.out.println("Secondary GPA = " + getSecondaryGPA());
		System.out.println();
	}
	double getGPA() {
		return 0;
	}
	void printCourses() {
		
	}

}

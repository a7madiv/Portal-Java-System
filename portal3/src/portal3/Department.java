package portal3;

public class Department {

	private int departmentId;
	private String departmentName;
	

	public Department() {

	}

	public Department(int departmentId, String departmentName) {

		setDepartmentId(departmentId);
		setDepartmentName(departmentName);
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	void printInfo() {

		System.out.println("Department Id = " + getDepartmentId());
		System.out.println("Department Name = " + getDepartmentName());
	}

}

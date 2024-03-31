package portal3;

import java.util.Scanner;

public class User {

	private int id;
	private String name;
	private int age;
	private int phoneNumber;
	private static int lastUserIdNumber = 0;

	public User() {

	}

	public User(String name, int age, int phoneNumber) {

		setId();
		setName(name);
		setAge(age);
		setPhoneNumber(phoneNumber);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setId() {
		this.id = ++lastUserIdNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {

		if (age >= 18) {

			this.age = age;
		} else {

			Scanner input = new Scanner(System.in);
			System.out.println("Enter Your Age Again");

			while (age < 18) {
				System.out.println("Enter Your Age Again");
				age = input.nextInt();

			}
			this.age = age;

		}
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	void printInfo() {

		System.out.println("User Id = " + getId());
		System.out.println("Name = " + getName());
		System.out.println("Age = " + getAge());
		System.out.println("Phone Number = " + getPhoneNumber());

	}

}

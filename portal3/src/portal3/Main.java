package portal3;

public class Main {

	public static void main(String[] args) {

		Student st1 = new Student("Omar", 18, 98,  79987);

		Student st2 = new Student("Ahmad", 19, 98,  79987);

		Staff staff1 = new Staff("Red", 20, 789789, 3, 500);
		st1.printInfo();
		st2.printInfo();
		st1.getCourse()[1]=new Course();
		

		staff1.printInfo();

	}
}
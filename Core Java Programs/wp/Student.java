package wp;

public class Student {
	void show() {
		System.out.println("implicit");
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
	}

}

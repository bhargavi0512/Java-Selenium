package wp;

public class Student3 {
	int id;
	String name;
	Student3(){
		id=0;
		name="Bhargavi";
		System.out.println("Default constructor");
	}
	Student3(int i, String n){
		this.id=i;
		this.name=n;
		System.out.println("Parametrized constructor");
	}
	void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student3 s1 = new Student3();               
        Student3 s2 = new Student3(101, "Bhargavi"); 

        s1.display();  
        s2.display(); 
    }
}



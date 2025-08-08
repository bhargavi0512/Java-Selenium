package mypackage;

public class Animal {
	void sound() {
		System.out.println("Animal Sound");
	}
}
class Bird extends Animal{
	void sound() {
		System.out.println("Bird makes sound");
	}
}
class Mammal extends Animal{
	void sound() {
		System.out.println("Mammal makes sound");
	}
}
class Reptile extends Animal{
	void sound() {
		System.out.println("Reptile makes sound");
	}
}
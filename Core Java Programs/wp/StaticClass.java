package wp;

public class StaticClass {
	static class Message{
		static void display() {
			System.out.println("hello");
		}
	}
	public static void main(String[] args) {
		StaticClass.Message.display();
	}

}

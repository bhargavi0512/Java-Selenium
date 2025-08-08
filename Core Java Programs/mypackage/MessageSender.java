package mypackage;

public class MessageSender {
	void Message() {
		System.out.println("Send a message");
	}
}
class EmailSender extends MessageSender{
	void Message() {
		System.out.println("Send Message via Email");
	}
}
class SMSSender extends MessageSender{
	void Message() {
		System.out.println("Send Message via SMS");
	}
}

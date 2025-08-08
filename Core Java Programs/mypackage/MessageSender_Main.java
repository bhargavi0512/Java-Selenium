package mypackage;

public class MessageSender_Main {
	public static void main(String[] args) {
		MessageSender m1 = new EmailSender();
		MessageSender m2 = new SMSSender();
		
		m1.Message();
		m2.Message();
	}

}

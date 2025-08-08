package mypackage;

public class Notification_Main {
		    public static void main(String[] args) {
		        Notification n1 = new EmailNotification();
		        Notification n2 = new SMSNotification();
		        Notification n3 = new PushNotification();

		        n1.send("Hello via Email");
		        n2.send("Hello via SMS");
		        n3.send("Hello via Push Notification");
		    }
}




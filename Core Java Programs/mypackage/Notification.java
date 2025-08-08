package mypackage;

abstract class Notification {
	    abstract void send(String message);
	}
	class EmailNotification extends Notification {
	    void send(String message) {
	        System.out.println("Email sent: " + message);
	    }
	}
	class SMSNotification extends Notification {
	    void send(String message) {
	        System.out.println("SMS sent: " + message);
	    }
	}
	class PushNotification extends Notification {
	    void send(String message) {
	        System.out.println("Push Notification sent: " + message);
	    }
	}

	
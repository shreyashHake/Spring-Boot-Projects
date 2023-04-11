package sender;

public class SMSNotification implements INotificationSender {
	public void sendNotification (String s){
		System.out.println("From: 8765312345");
		System.out.println("To: 9934323123");
		System.out.println(s);
	}
}

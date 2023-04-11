package sender;

public class EmailNotification implements INotificationSender {
	public void sendNotification (String s){
		System.out.println("***********************");
		System.out.println("From: demo@hitachi.com");
		System.out.println("To: demo@hitachi.com");
		System.out.println("Message:");
		System.out.println(s);
		System.out.println("***********************");
	}
}

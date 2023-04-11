package test;

import sender.INotificationSender;

public class TestMessageNotification {
	private INotificationSender notificationSender;

	
	  public TestMessageNotification(INotificationSender notificationSender) {
	  this.notificationSender = notificationSender; }
	 

	/*
	 * public void setNotificationSender(INotificationSender writer) {
	 * this.notificationSender = writer; }
	 */

	public void run() {
		String s = "Hello, This is an update on your delivery. The parcel  is expected to reach in 1 day.";
		notificationSender.sendNotification(s);
	}

}

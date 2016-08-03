package com.cmpe202.g62.notification;

import java.util.Vector;

import com.cmpe202.g62.request.impl.Request;

public class RideNotification implements Notification {
	private Vector<Notification> v = new Vector<Notification>();

	@Override
	public void update(Request r, String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
		for (Notification notification : v) {
			notification.update(r, message);
		}
		

	}

}

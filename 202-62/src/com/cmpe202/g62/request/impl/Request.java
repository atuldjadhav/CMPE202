package com.cmpe202.g62.request.impl;

import java.util.ArrayList;

import com.cmpe202.g62.notification.Notification;
import com.cmpe202.g62.request.RequestInterface;
import com.cmpe202.g62.request.State;
import com.cmpe202.g62.schedule.Scheduling;

public abstract class Request implements RequestInterface{
	protected Scheduling scheduling;
	private State state;
	private ArrayList<Notification> notifications = new ArrayList<Notification>();
	
	public abstract void schedule();
	
	public Request(Scheduling s){
		scheduling = s;
	}
	public Request(){
		state = new WaitingState(this);
	}

	protected void ride(){
		scheduling.ride();
	}
	
	protected void park(){
		scheduling.park();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public void receiveRequest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processRequest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void completeRequest() {
		// TODO Auto-generated method stub
		
	}
	
	public void addObserver(Notification n){
		notifications.add(n);
	}
	
	public void removeObserver(Notification n){
		notifications.remove(n);
	}
	
	public void notifyObservers(String message){
		for (Notification notification : notifications) {
			notification.update(this, message);
		}
	}
	
	
}

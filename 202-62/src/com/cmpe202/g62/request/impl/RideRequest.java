package com.cmpe202.g62.request.impl;

import com.cmpe202.g62.request.State;
import com.cmpe202.g62.schedule.Scheduling;

public class RideRequest extends Request {

	public RideRequest(Scheduling s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void schedule() {
		// TODO Auto-generated method stub

	}
	
	public void setState(State s){
		notifyObservers(null);
		super.setState(s);
	}
	
	public State getState(){
		return null;
	}

}

package com.framework.core.task;


public class Task implements Runnable{
	/**
	 * set to <code>true</code> if task is running or set to <code>false</code> if task is stopped
	 */
	private boolean _alive;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(_alive) {
			
		}
	}
	

	public void onCreate() {
	}

	public boolean onInit() {
	    return true;
	}

	public boolean onStart()  {
	    return true;
	}

	public void onSystemStarted() {

	}

}

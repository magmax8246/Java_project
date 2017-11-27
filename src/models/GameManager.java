package models;

import views.MenuView;

public class GameManager implements Runnable{
	
	private boolean running=false;
	private Thread thread;
	
	
	public synchronized void start() {
		if(running)
			return;
		running=true;
		thread=new Thread(this);
		thread.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		MenuView m=new MenuView("Title",800,600);  
	}

}

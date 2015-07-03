package org.bisso.hr.integration;


public abstract class BaseReceiver {
	
	protected abstract void startLog() ;

	protected abstract boolean validate () ;

	public void execute () {
			
		startLog();
		
		if ( !validate() ) response(); 
		
		handleMessage();
		
		processedLog();
		
		response();
		
	}
	
	protected abstract void handleMessage();
	
	protected abstract void processedLog ();
	
	protected abstract void response();	
		
}

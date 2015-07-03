package org.bisso.hr.integration.customer;

import org.bisso.hr.integration.AddCustomerInbound;
import org.bisso.hr.integration.BaseReceiver;

public class AddCustomerInboundTest {
	
	public static void main(String[] args) {
		
		BaseReceiver receiver = new AddCustomerInbound();
		receiver.execute();
		
	}

}

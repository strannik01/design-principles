package com.dev21.solid.dip.violated;

import java.util.ArrayList;

public class CustomerRelationOffice {
	DeliveryService deliveryService = new ElectronicDeliveryService();
//	DeliveryService deliveryService = new MailDeliveryService();
	
	ArrayList<String> messages = new ArrayList<>();
	
	public void sendUrgent(String message) {
		deliveryService.send(message);
	}
	
	public void sendNormal(String message) {
		messages.add(message);
		if (messages.size() > 10) {
			sendAll();
		}
	}

	public void sendAll() {
		for (String message : messages) {
			deliveryService.send(message);
		}
		messages = new ArrayList<>();
	}
}

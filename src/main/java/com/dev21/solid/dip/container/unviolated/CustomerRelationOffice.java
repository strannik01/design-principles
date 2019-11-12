package com.dev21.solid.dip.container.unviolated;

import java.util.ArrayList;

public class CustomerRelationOffice {
	DeliveryService deliveryService = (DeliveryService) Container.getComponent("deliveryService");
	
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

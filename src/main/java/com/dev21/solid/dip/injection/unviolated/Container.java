package com.dev21.solid.dip.injection.unviolated;

import java.util.HashMap;
import java.util.Map;

public class Container {
	
	private static Map<String, Object> components = initMap();
	
	private static Map<String, Object> initMap() {
		components = new HashMap<>();

		//DeliveryService deliveryService = new ElectronicDeliveryService();
		DeliveryService deliveryService = new MailDeliveryService();
		components.put("deliveryService", deliveryService);
		
//		CustomerRelationOffice customerRelationOffice = new CustomerRelationOffice(deliveryService);
		CustomerRelationOffice customerRelationOffice = new CustomerRelationOffice();
		components.put("customerRelationOffice", customerRelationOffice);
		
		customerRelationOffice.setDeliveryService(deliveryService);
		
		return components;
	}
	
	public static Object getComponent(String componentName) {
		return components.get(componentName);
	}

}

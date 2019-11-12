package com.dev21.solid.dip.injection.unviolated;

public class ElectronicDeliveryService implements DeliveryService {

	@Override
	public void send(String message) {
		System.out.println("Enviando un correo electrónico: " + message);
	}

}

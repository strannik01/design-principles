package com.dev21.solid.dip.violated;

public class MailDeliveryService implements DeliveryService {

	@Override
	public void send(String message) {
		System.out.println("Enviando un correo físico: " + message);
	}

}

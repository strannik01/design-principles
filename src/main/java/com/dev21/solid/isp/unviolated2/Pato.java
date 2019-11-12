package com.dev21.solid.isp.unviolated2;

public class Pato implements AnimalCaminante, AnimalVolador {

	@Override
	public void volar() {
		System.out.println("Volar");
		
	}

	@Override
	public void caminar() {
		System.out.println("Caminar");
		
	}

}

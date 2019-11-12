package com.dev21.solid.isp.unviolated2;

public class AnimalTest {
	
	public static void main(String[] args) {
		AnimalCaminante animal = new Tortuga();
				
		animal.caminar();
		
		AnimalVolador animalVolador = new Colibri();
		animalVolador.volar();
		
		System.out.println();
		
		Pato pato = new Pato();
		pato.caminar();
		pato.volar();
		
		
	}

}

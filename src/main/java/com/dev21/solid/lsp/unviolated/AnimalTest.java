package com.dev21.solid.lsp.unviolated;

public class AnimalTest {
	
	public static void main(String[] args) {
		AnimalCaminador animal = new Tortuga();
		System.out.println(animal.caminar());
		
		AnimalVolador animal2 = new Pajaro();
		System.out.println(animal2.volar());
	}

}

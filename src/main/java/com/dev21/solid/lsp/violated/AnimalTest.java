package com.dev21.solid.lsp.violated;

public class AnimalTest {
	
	public static void main(String[] args) {
		Animal animal = new Tortuga();
				
		if (animal instanceof Colibri) {
			System.out.println(animal.caminar());
			System.out.println(animal.volar());
		} else if (animal instanceof Tortuga){
			System.out.println(animal.volar());
		}
	}

}

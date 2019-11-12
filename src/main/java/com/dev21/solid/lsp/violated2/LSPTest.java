package com.dev21.solid.lsp.violated2;

public class LSPTest {

	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado();
		cuadrado.setHeigth(6);
		cuadrado.setWidth(4);
		System.out.println(cuadrado.calcularArea());
		
		Rectangulo rectangulo = new Rectangulo();
		rectangulo.setHeigth(5);
		rectangulo.setWidth(5);
		
		System.out.println(rectangulo.calcularArea());
		
		
		
	}

}

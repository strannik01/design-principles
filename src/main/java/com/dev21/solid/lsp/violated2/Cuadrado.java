package com.dev21.solid.lsp.violated2;

public class Cuadrado extends Rectangulo {
	
	public void setHeigth(int heigth) {
		super.setHeigth(heigth);
		super.setWidth(heigth);
	}
	
	public void setWidth(int width) {
		super.setHeigth(width);
		super.setWidth(width);
	}
	
	public int calcularArea() {
		return super.calcularArea();
	}

}

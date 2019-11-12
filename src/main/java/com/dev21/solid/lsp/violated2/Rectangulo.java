package com.dev21.solid.lsp.violated2;

public class Rectangulo {
	private int width;
	private int heigth;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
	public int calcularArea() {
		return getWidth() * getHeigth();
	}

}

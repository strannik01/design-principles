package com.dev21.solid.isp.violated;

public class AllInOnePrinter implements SmartDevice {

	@Override
	public void print() {
		System.out.println("Imprimiendo");
	}

	@Override
	public void fax() {
		System.out.println("Enviando fax");
	}

	@Override
	public void scan() {
		System.out.println("Escaneando");
	}

}

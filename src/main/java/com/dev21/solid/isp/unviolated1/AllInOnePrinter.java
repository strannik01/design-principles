package com.dev21.solid.isp.unviolated1;

public class AllInOnePrinter implements Printer, Scanner, Fax {

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

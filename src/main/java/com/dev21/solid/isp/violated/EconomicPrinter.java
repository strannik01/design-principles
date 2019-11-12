package com.dev21.solid.isp.violated;

public class EconomicPrinter implements SmartDevice {

	@Override
	public void print() {
		System.out.println("Imprimiendo");
	}

	@Override
	public void fax() {
		throw new UnsupportedOperationException();

	}

	@Override
	public void scan() {
		throw new UnsupportedOperationException();
	}

}

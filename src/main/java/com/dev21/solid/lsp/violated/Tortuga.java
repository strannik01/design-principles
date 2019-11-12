package com.dev21.solid.lsp.violated;

public class Tortuga extends Animal {

	@Override
	public String volar() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String caminar() {
		return "la tortuga camina";
	}

}

package com.dev21.solid.lsp.violated;

public class Colibri extends Animal {

	@Override
	public String volar() {
		return "colibri está volando";
	}

	@Override
	public String caminar() {
		throw new UnsupportedOperationException();
	}

}

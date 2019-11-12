package com.dev21.solid.isp.violated2;

public class JohnDoe implements Athlete {

	@Override
	public void compete() {
		System.out.println("John Doe started competing");
	}

	@Override
	public void swim() {
		System.out.println("John Doe started swimming");
	}

	@Override
	public void highJump() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void longJump() {
		throw new UnsupportedOperationException();
	}

}

package com.dev21.solid.isp.unviolated3;

public class JohnDoe implements SwimmingAthlete {

	@Override
	public void compete() {
		System.out.println("John Doe started competing");
	}

	@Override
	public void swim() {
		System.out.println("John Doe started swimming");		
	}


}

package com.cg.services;

public class CallServices {
	AddService addService;

	public CallServices(AddService addService) {
		this.addService = addService;
	}

	public int calc(int num1, int num2) {
		System.out.println("**--- CalcService calc executed ---**");
		return addService.add(num1, num2);
	}

}

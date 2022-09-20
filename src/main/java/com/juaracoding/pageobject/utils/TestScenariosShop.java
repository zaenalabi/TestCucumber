package com.juaracoding.pageobject.utils;

public enum TestScenariosShop {
	
	T1("User Search Product"),
	T2("Add Cart and Place Order");
	
	private String testShop;
	
	TestScenariosShop(String value) {
		testShop = value;
	}
	
	public String getTestShop() {
		return testShop;
	}

}

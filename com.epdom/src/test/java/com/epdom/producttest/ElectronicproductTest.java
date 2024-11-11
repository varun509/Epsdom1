package com.epdom.producttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ElectronicproductTest {
	@Test
	public void addProduct() {
		Reporter.log("add succes Electronic",true);
	}
	@Test
	public void updateProduct() {
		Reporter.log("updated success Electronic",true);
	}
	@Test
	public void removeProduct() {
		Reporter.log("REMOVED succes Electronic",true);
		
	}

}

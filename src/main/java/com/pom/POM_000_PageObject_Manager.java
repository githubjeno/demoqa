package com.pom;

import org.openqa.selenium.WebDriver;

public class POM_000_PageObject_Manager {

	public static WebDriver driver;
	
  private POM_001_HOME p001home;
  private POM_002_SearchresultforSunGlasses p002search;
  private POM_003_Blacksunglasses_ProductDescription p003blacksunglass;
  private POM_004_Cart p004cart;
  private  POM_005_Checkout p005checkout;

  
  
  public POM_000_PageObject_Manager(WebDriver driver2) {
	this.driver= driver2;
	
}
public POM_001_HOME getP001home() {
	  p001home = new POM_001_HOME(driver);
	return p001home;
}
public POM_002_SearchresultforSunGlasses getP002search() {
	 p002search = new POM_002_SearchresultforSunGlasses(driver);
	return p002search;
}
public POM_003_Blacksunglasses_ProductDescription getP003blacksunglass() {
	p003blacksunglass = new POM_003_Blacksunglasses_ProductDescription(driver);
	return p003blacksunglass;
}
public POM_004_Cart getP004cart() {
	p004cart = new POM_004_Cart(driver);
	return p004cart;
}
public POM_005_Checkout getP005checkout() {
	p005checkout = new POM_005_Checkout(driver);
	return p005checkout;
}
  
  
}

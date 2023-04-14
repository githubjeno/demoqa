package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_004_Cart {

	
	
	
	public POM_004_Cart(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward wp-element-button']")
	private WebElement proceedtocheckout;
}

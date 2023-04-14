package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_003_Blacksunglasses_ProductDescription {

	
	
	
	public POM_003_Blacksunglasses_ProductDescription(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}


	public WebElement getSelectcolour() {
		return selectcolour;
	}


	public WebElement getsize() {
		return size;
	}


	public WebElement getAddtocartbutton() {
		return Addtocartbutton;
	}


	public WebElement getCartselect() {
		return cartselect;
	}


	@FindBy(xpath = "//select[@id='pa_color']")
	private WebElement selectcolour;
	
	@FindBy(xpath = "//select[@id=\"pa_size\"]")
	private WebElement size;
	
	@FindBy(xpath = "//button[text()='Add to cart']")
	private WebElement Addtocartbutton;
	
	
	@FindBy(xpath = "//i[@class='icon_bag_alt']")
	private WebElement cartselect;
}

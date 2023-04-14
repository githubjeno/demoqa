package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_002_SearchresultforSunGlasses {

	
	public POM_002_SearchresultforSunGlasses(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getBlacksunglasses() {
		return blacksunglasses;
	}

	@FindBy(xpath = "//a[text()='quay australia dirty habit black sunglasses']")
	private WebElement blacksunglasses;
}

package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_001_HOME {
	
	public POM_001_HOME(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}



	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement searchbutton;
	
	
	
	public WebElement getSearchbutton() {
		return searchbutton;
	}



	public WebElement getSearchinputtext() {
		return searchinputtext;
	}



	@FindBy(xpath = "//input[@type=\"search\"]")
	private WebElement searchinputtext;
}

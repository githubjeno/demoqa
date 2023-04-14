package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_005_Checkout {
	public POM_005_Checkout(WebDriver driver) {
		PageFactory.initElements( driver,this);
	} 
	
	@FindBy(xpath = "//input[@name='billing_first_name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name=\"billing_last_name\"]")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@name=\"billing_company\"]")
	private WebElement billingcompany;
	
	@FindBy(xpath = "//select[@name='billing_country']")
	private WebElement selectcountry;
	
	@FindBy(xpath = "//input[@name=\"billing_address_1\"]")
	private WebElement addressline1;
	
	@FindBy(xpath = "//input[@name=\"billing_address_2\"]")
	private WebElement addressline2;
	
	
	@FindBy(xpath = "//input[@name=\"billing_city\"]")
	private WebElement billingcity;
	
	@FindBy(xpath = "//select[@name='billing_state']")
	private WebElement state;
	
	@FindBy(xpath = "//input[@id=\"billing_postcode\"]")
	private WebElement pincode;
	
	@FindBy(xpath = "//input[@name=\"billing_phone\"]")
	private WebElement billingphone;
	
	@FindBy(xpath = "//input[@name=\"billing_email\"]")
	private WebElement billingemail;
	
	@FindBy(xpath = "//textarea[@name=\"order_comments\"]")
	private WebElement ordernotes;
	
	@FindBy(xpath = "//input[@id='terms']")
	private WebElement agreecheckbox;
	
	@FindBy(xpath = "//button[@id='place_order']")
	private WebElement placeorder;

	

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingcompany() {
		return billingcompany;
	}

	public WebElement getSelectcountry() {
		return selectcountry;
	}

	public WebElement getAddressline1() {
		return addressline1;
	}

	public WebElement getAddressline2() {
		return addressline2;
	}

	public WebElement getBillingcity() {
		return billingcity;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getBillingphone() {
		return billingphone;
	}

	public WebElement getBillingemail() {
		return billingemail;
	}

	public WebElement getOrdernotes() {
		return ordernotes;
	}

	public WebElement getAgreecheckbox() {
		return agreecheckbox;
	}

	public WebElement getPlaceorder() {
		return placeorder;
	}

}

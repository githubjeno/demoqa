package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.Keys;

import com.baseclass.BaseClass;
import com.helper.File_Reader;
import com.pom.POM_000_PageObject_Manager;
import com.pom.POM_001_HOME;
import com.pom.POM_002_SearchresultforSunGlasses;
import com.pom.POM_003_Blacksunglasses_ProductDescription;
import com.pom.POM_004_Cart;
import com.pom.POM_005_Checkout;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderingProduct extends BaseClass {
	
	POM_000_PageObject_Manager pom = new POM_000_PageObject_Manager(driver);
	
	@Given("user enters the url")
	public void user_enters_the_url() throws IOException {
	    URL(File_Reader.getinstance().geturl());
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
	   pom.getP001home().getSearchbutton().click();
	}

	@When("enters the searchtext {string} in the textbox and press enter")
	public void enters_the_searchtext_in_the_textbox_and_press_enter(String string) {
	  pom.getP001home().getSearchinputtext().sendKeys(string+Keys.ENTER);
	  
	}

	@When("user clicks on black sunglasses")
	public void user_clicks_on_black_sunglasses() {
	   pom.getP002search().getBlacksunglasses().click();
	}

	@When("user selects the required colour and size")
	public void user_selects_the_required_colour_and_size() {
		select_class(pom.getP003blacksunglass().getSelectcolour(),"byvalue","black");
		select_class(pom.getP003blacksunglass().getsize(),"byvalue","one");
		
	   
	}

	@When("Add to cart")
	public void add_to_cart() throws InterruptedException {
	    pom.getP003blacksunglass().getAddtocartbutton().click();
	    Thread.sleep(4444);
	}

	@When("user clicks on the cart icon")
	public void user_clicks_on_the_cart_icon() {
	    pom.getP003blacksunglass().getCartselect().click();
	}

	@When("clicks on proceed to checkout")
	public void clicks_on_proceed_to_checkout() {
	   pom.getP004cart().getProceedtocheckout().click();
	}

	@When("user enters the firstname and last name")
	public void user_enters_the_firstname_green_and_last_name() throws IOException {
	   pom.getP005checkout().getFirstname().sendKeys(File_Reader.getinstance().getfirstname());
	   pom.getP005checkout().getLastname().sendKeys(File_Reader.getinstance().getlastname());
	}

	@When("enters the compnay name")
	public void enters_the_compnay_name() {
	    pom.getP005checkout().getBillingcompany().sendKeys("adani");
	}

	@When("selects country or region and enters the street addressone and two")
	public void selects_country_or_region_and_enters_the_street_addressone_and_two() {
		select_class(pom.getP005checkout().getSelectcountry(),"byvalue","IN");
	   pom.getP005checkout().getAddressline1().sendKeys("chennai");
	   pom.getP005checkout().getAddressline2().sendKeys("anna nagar");
	}

	@When("enter the town or city and selects the state")
	public void enter_the_town_or_city_and_selects_the_state() {
	   pom.getP005checkout().getBillingcity().sendKeys("anna tower");
	   select_class(pom.getP005checkout().getState(),"byvalue","TN");
	}

	@When("enter the pincode phoneno emailaddress")
	public void enter_the_pincode_phoneno_emailaddress() {
	    pom.getP005checkout().getPincode().sendKeys("601248");
	    pom.getP005checkout().getBillingphone().sendKeys("1234678914");
	    pom.getP005checkout().getBillingemail().sendKeys("dasfjajdfjk@gmail.com");
	}

	@When("enters his additional information")
	public void enters_his_additional_information() {
	   pom.getP005checkout().getOrdernotes().sendKeys("Enjoy this summer with this cool sun glass");
	}

	@When("selects the checkbox i have read and agree to website contition")
	public void selects_the_checkbox_i_have_read_and_agree_to_website_contition() throws InterruptedException {
	   Thread.sleep(4444);
		pom.getP005checkout().getAgreecheckbox().click();
	}

	@When("clicks on place order")
	public void clicks_on_place_order() {
	  pom.getP005checkout().getPlaceorder().click();
	}

	@Then("all the details of the order are displayed take screenshot")
	public void all_the_details_of_the_order_are_displayed_take_screenshot() throws IOException, InterruptedException {
		Thread.sleep(2222);
	   screenshot("ordersummary");
	}

}

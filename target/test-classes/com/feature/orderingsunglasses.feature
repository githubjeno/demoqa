Feature: ordering products in demoqa site
Scenario: Search for sunglases
Given user enters the url
When user clicks on search button
And enters the searchtext "sun glasses" in the textbox and press enter

Scenario: Select black sunglasses and add to cart
 When user clicks on black sunglasses
 And user selects the required colour and size
 And Add to cart
 
 Scenario: Checkout the products in cart
 When user clicks on the cart icon
 And clicks on proceed to checkout
 
 Scenario: entering the billing details and final placing of order
 When user enters the firstname and last name
 And enters the compnay name 
 And selects country or region and enters the street addressone and two
 And enter the town or city and selects the state
 And enter the pincode phoneno emailaddress
 And enters his additional information
 And selects the checkbox i have read and agree to website contition
 And clicks on place order
 Then all the details of the order are displayed take screenshot
 
 
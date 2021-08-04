Feature: Checkout Flow using Klarna Payment Method
  As a tester
  I want to ensure Klarna Checkout feature working as expected
  So that our end user can Shop from LG.com without any issues

  Background:
    Given I am at LG Home Page

  @checkout @guest @klarna @smoke @regression @TC_001 
  Scenario: As a brand new guest user, ensure user able to checkout the HE OMD Innoval Product with Klarna monthly installment
    Given I enter OMD Klarna enabled product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMD Klarna enabled product displays in search results page
    When  I will enter zipCode for checking the delivery availability for OMD Klarna enabled Product
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Klarna" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    Then  I Enter Klarna SSN Details
    # confirmation page TODO
    
    
 	@checkout @guest @klarna @smoke @regression @TC_002 
  Scenario: As a brand new guest user, ensure user able to checkout HA OMD Innoval Product with monthly installment
			Given I Find "HA OMD Klarna" product using search function
			And  I will verify "HA OMD Klarna" product displays in search results page and navigate to PDP page
    	When I Click on "Add to cart" link
    	And I enter zipCode to check the delivery availability for "HA OMD Klarna" product
    	And I Input zipcode on price breakdown section and veirfy estimated tax is calculated
    	And   I click on Secure Checkout button
    	And   I click on Continue as Guest from Sign in page
	    Then  I verify "Order Summary" is displayed
	    And   I click on Save and Continue button after fill out Shipping Info
	    And   I verify the suggested address
	    When  I click on Continue to Payment button
	    Then  I verify "Order Summary" is displayed
	    Then  I will see Payment method option list in Billing Page
	    When  I choose the "Klarna" radio button from Billing Page
		#InComplete "4 interest - fee payments of "000.000" is to be selected is not displayed


  @checkout @guest @klarna @smoke @regression @TC_003
  Scenario: As a brand new guest user, ensure user able to checkout HE OMD Innoval Product with financing
    Given I enter OMD Klarna enabled product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMD Klarna enabled product displays in search results page
    When  I will enter zipCode for checking the delivery availability for OMD Klarna enabled Product
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Klarna" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    Then  I Enter Klarna SSN Details
    # confirmation page TODO 
    
  @checkout @guest @klarna @smoke @regression @TC_004 
  Scenario: As a brand new guest user, ensure user able to checkout HA OMD Innoval Product with financing
			Given I Find "HA OMD Klarna" product using search function
			And  I will verify "HA OMD Klarna" product displays in search results page and navigate to PDP page
    	When I Click on "Add to cart" link
    	And I enter zipCode to check the delivery availability for "HA OMD Klarna" product
    	And I Input zipcode on price breakdown section and veirfy estimated tax is calculated
    	And   I click on Secure Checkout button
    	And   I click on Continue as Guest from Sign in page
	    Then  I verify "Order Summary" is displayed
	    And   I click on Save and Continue button after fill out Shipping Info
	    And   I verify the suggested address
	    When  I click on Continue to Payment button
	    Then  I verify "Order Summary" is displayed
	    Then  I will see Payment method option list in Billing Page
	    When  I choose the "Klarna" radio button from Billing Page
		#InComplete "from $000.00/mo. for 12 months" is to be selected is not displayed
    
  @checkout @guest @klarna @smoke @regression @TC_009
  Scenario: Ensure Guest user able to apply coupon code during Klarna checkout flow using OMD product
			Given I Find "HE OMD Klarna" product using search function
			And  I will verify "HE OMD Klarna" product displays in search results page and navigate to PDP page
    	When I Click on "Add to cart" link
    	And I enter zipCode to check the delivery availability for "HE OMD Klarna" product
    	And I Input zipcode on price breakdown section and veirfy estimated tax is calculated
    	When I Enter Promocode "SPRINGS" under Promo Edit box 
   		And I Click on "Apply" button
   		Then I Should see a validation message saying You used promotion code "SPRINGS" and Discount and Total price should reflect
    	And   I click on Secure Checkout button
    	And   I click on Continue as Guest from Sign in page
	    Then  I verify "Order Summary" is displayed
	    And   I click on Save and Continue button after fill out Shipping Info
	    And   I verify the suggested address
	    When  I click on Continue to Payment button
	    Then  I verify "Order Summary" is displayed
	    Then  I will see Payment method option list in Billing Page
	    When  I choose the "Klarna" radio button from Billing Page
	    #Provide valid promo code
		#InComplete "from $000.00/mo. for 12 months" is to be selected is not displayed
		
	@checkout @guest @klarna @smoke @regression @TC_0011 
  Scenario: Change payment method from Klarna to Credit Card
			Given I Find "HE OMD Klarna" product using search function
			And  I will verify "HE OMD Klarna" product displays in search results page and navigate to PDP page
    	When I Click on "Add to cart" link
    	And I enter zipCode to check the delivery availability for "HE OMD Klarna" product
    	And I Input zipcode on price breakdown section and veirfy estimated tax is calculated
    	And   I click on Secure Checkout button
    	And   I click on Continue as Guest from Sign in page
	    Then  I verify "Order Summary" is displayed
	    And   I click on Save and Continue button after fill out Shipping Info
	    And   I verify the suggested address
	    When  I click on Continue to Payment button
	    Then  I verify "Order Summary" is displayed
	    Then  I will see Payment method option list in Billing Page
	    When  I choose the "Klarna" radio button from Billing Page
		#InComplete "4 interest - fee payments of "000.000" is to be selected is not displayed
		
	@checkout @guest @klarna @smoke @regression @TC_0012 
  Scenario: Ensure Guest user should be able to change Billing address during checkout when payment method is Klarna
			Given I Find "HE OMD Klarna" product using search function
			And  I will verify "HE OMD Klarna" product displays in search results page and navigate to PDP page
    	When I Click on "Add to cart" link
    	And I enter zipCode to check the delivery availability for "HE OMD Klarna" product
    	And I Input zipcode on price breakdown section and veirfy estimated tax is calculated
    	And   I click on Secure Checkout button
    	And   I click on Continue as Guest from Sign in page
	    Then  I verify "Order Summary" is displayed
	    And   I click on Save and Continue button after fill out Shipping Info
	    And   I verify the suggested address
	    When  I click on Continue to Payment button
	    Then  I verify "Order Summary" is displayed
	    Then  I will see Payment method option list in Billing Page
	    When  I choose the "Klarna" radio button from Billing Page
	    And I click "Use a different billing address" button on checkout page 
	    And I enter different Address in Use a different billing address section
    	And I click "Review and Place Order" button on checkout page
    	Then I verify user is on Review and Place order page and all the details are displayed correctly
    	When I click "I Agree" button on Checkout Review Page
    	And I click "Sign Me Up" button on Checkout Review Page
    	And I click "Place Order" button on Checkout Review Page
    	#Incomplete Klarna details
    	
    	
  @checkout @guest @klarna @smoke @regression @TC_0014
  Scenario: Ensure OMV product doesnt have Klarna payment option for Guest User
			Given I Find "OMV Subscription" product using search function
   		And  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
			When I Click on "Add to cart" link
			And I Select Subscription as "Single Purchase"
    	And I Input zipcode "CA" on price breakdown section and veirfy estimated tax is calculated
    	And   I click on Secure Checkout button
    	And   I click on Continue as Guest from Sign in page
	    Then  I verify "Order Summary" is displayed
	    And   I click on Save and Continue button after fill out Shipping Info
	    And   I verify the suggested address
	    When  I click on Continue to Payment button
	    Then  I verify "Buy Now. Pay Later" is not displayed
	    
	    
	@checkout @guest @klarna @smoke @regression @TC_0015 @TestRun
  Scenario: As a guest user, checkout combination with OMD and OMV product
			Given I Find "OMV Subscription" product using search function
   		And  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
			And I Select Subscription as "Single Purchase"
			When I Click on "Add to cart" link
			And I Find "OMD HA Innovel" product using search function
   		And  I will verify "OMD HA Innovel" product displays in search results page and navigate to PDP page
			When I Click on "Add to cart" link
   		And I Click on "View cart" link
   		Then  I Verify "2" item is added to the cart
    	And I Input zipcode "CA" on price breakdown section and veirfy estimated tax is calculated
   		And   I click on Secure Checkout button	
    	And   I click on Continue as Guest from Sign in page
	    Then  I verify "Order Summary" is displayed
	    And   I click on Save and Continue button after fill out Shipping Info
	    And   I verify the suggested address
	    And I click "Overnight Shipping - 2 to 4 business days" button on checkout page
	    When  I click on Continue to Payment button
	    Then  I verify "Order Summary" is displayed
	    Then  I verify "Buy Now. Pay Later" is not displayed
	    #TestData
	    
	    
	@checkout @guest @klarna @smoke @regression @TC_0024 @TestRun
  Scenario: As a guest user, checkout with OMD products and verify Edit cart link on checkout(shipping) page with Klarna checkout
			Given I Find "OMV Subscription" product using search function
   		And  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
			When I Click on "Add to cart" link
   		And I Click on "View cart" link
			Then I verify Price Breakdown Order Summary section on cart page
			And I click on Secure Checkout button	
    	And I click on Continue as Guest from Sign in page
			Then  I verify "Order Summary" is displayed
	    And  I click on Save and Continue button after fill out Shipping Info
			And I verify the suggested address
			And I click on "Edit Cart" link
			Then I verify "Your Cart" is displayed
			When I update product quantity to "2"
			And I click on Secure Checkout button	
			And   I click on Continue as Guest from Sign in page
	    Then  I verify "Order Summary" is displayed
	    And   I click on Save and Continue button after fill out Shipping Info
	    And   I verify the suggested address
	    When  I click on Continue to Payment button
	    Then  I verify "Order Summary" is displayed
	    Then  I will see Payment method option list in Billing Page
	    When  I choose the "Klarna" radio button from Billing Page
			#Incomplete Klarna details  #TestData
			
			
			
	@checkout @guest @klarna @smoke @regression @TC_0025 
  Scenario: As a guest user, checkout with OMD products and verify Change shipping address on checkout(shipping) page with Klarna checkout
			Given I Find "HE OMD Klarna" product using search function
   		And  I will verify "HE OMD Klarna" product displays in search results page and navigate to PDP page
			When I Click on "Add to cart" link
   		And I Click on "View cart" link
			Then I verify Price Breakdown Order Summary section on cart page
			And I click on Secure Checkout button	
    	And I click on Continue as Guest from Sign in page
			Then  I verify "Order Summary" is displayed
	    And   I click on Save and Continue button after fill out Shipping Info
			And I verify the suggested address
			When I verify shipping Address on Checkout page
			And I Click on "edit" link 
			And I edit the address and click on Save and Continue
			And   I verify the suggested address
	    Then I verify shipping address is updated
	    When  I click on Continue to Payment button
	    Then  I verify "Order Summary" is displayed
	    Then  I will see Payment method option list in Billing Page
	    When  I choose the "Klarna" radio button from Billing Page
	    #TestData
	    
	    
	@checkout @guest @klarna @smoke @regression @TC_0026 
  Scenario: As a guest user, checkout with OMD products and verify Return to Shipping link on checkout(Payment & Billing) page with Klarna checkout
			Given I Find "OMD HE Klarna" product using search function
   		And  I will verify "OMD HE Klarna" product displays in search results page and navigate to PDP page
			When I Click on "Add to cart" link
   		And I Click on "View cart" link
			Then I verify Price Breakdown Order Summary section on cart page
			And I click on Secure Checkout button	
    	And I click on Continue as Guest from Sign in page
			Then  I verify "Order Summary" is displayed
	    And   I click on Save and Continue button after fill out Shipping Info
			And I verify the suggested address
	    When  I click on Continue to Payment button
	    Then  I verify "Order Summary" is displayed
	    And I click "Return to Shipping" button on checkout page
	    Then I verify System should navigate the Shipping page
	    Then  I verify "Order Summary" is displayed
	    When I click "Save and continue" button on checkout page
	    And I verify the suggested address
	    And  I click on Continue to Payment button
	    Then  I will see Payment method option list in Billing Page
	    When  I choose the "Klarna" radio button from Billing Page	    
		#payment Incomplete #testdata
		
		
			
	    
	    
	    
    
    
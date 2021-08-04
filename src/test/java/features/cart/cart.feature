Feature: Cart Page

  Background:
    Given I am at LG Home Page

  @checkout @cart @smoke @regression @TC_001
  Scenario: As a guest user ensure you able to Edit billing period for OMV subscription product
    Given I enter OMV subscription product Code into search edit box from GNB
    When I click on search icon from GNB
    And I will verify OMV Subscription product displays in search results page
    And I will click on add to cart Button from Search Results Page for "OMV_Subscription"
    And I will select the subscription Frequency as "3months"
    And I will click on Proceed to Cart Button
    And I will verify product is added into Cart Page
    And I will update the Delivery Frequency date to sixMonths
    When I will accept the alert
    Then I should see the updated Delivery Frequency date is reflected

  @checkout @cart @smoke @regression @TC_002
  Scenario: As a guest user ensure you able to Increase Decrease quantity for OMV non subscription product
    Given I enter OMV subscription product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMV Subscription product displays in search results page
    Then  I will click on add to cart Button from Search Results Page for "OMV_Subscription"
    Then  I will select the subscription Frequency as "0months"
    When  I will click on Proceed to Cart Button
    Then  I will verify product is added into Cart Page
    When  I will select the "5" as quantity
    Then  I should able to see the updated price as per quantity
    When  I will select the "3" as quantity
    Then  I should able to see the updated price as per quantity

  @checkout @cart @smoke @regression @TC_003 
  Scenario: As a guest user ensure you able to verify Estimated Tax for Hawaii using OMV subscription product
    Given I enter OMV subscription product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMV Subscription product displays in search results page
    Then  I will click on add to cart Button from Search Results Page for "OMV_Subscription"
    Then  I will select the subscription Frequency as "0months"
    When  I will click on Proceed to Cart Button
    Then  I will verify product is added into Cart Page
    When  I enter zipCode to check the delivery availability for "HAWAII"
    And   I should be able to see Estimated Price and Order Total
    And   I should be able to see Estimated Tax Price
    When  I enter zipCode to check the delivery availability for "NewYork"
    And   I should be able to see Estimated Price and Order Total
    And   I should be able to see Estimated Tax Price
    Then  I should able see Hawaii estimated tax less than New York estimated tax

 @checkout @cart @smoke @regression @TC_004 
  Scenario: As a guest user ensure user able to remove item from cart after adding an OMD HE Product
    Given I Find "OMV Non Subscription" product using search function
    And  I will verify "OMV Non Subscription" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link
		And I Click on "View cart" link
   	Then  I Verify "1" item is added to the cart
    And I Click on "Remove Item" link
    Then Your cart is Empty messge should display along with SEE ALL DEALS button

  @checkout @cart @smoke @regression @TC_005 
  Scenario: As a guest user, ensure guest user able to add two different type of OMV Non Subscription product and remove one of them 
  	Given I Find "OMV Non Subscription" product using search function
  	And  I will verify "OMV Non Subscription" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link
		And I Click on "View cart" link
   	Then  I Verify "1" item is added to the cart
		Then I verify Order summay section price break down is correct
		When I Find "OMV Subscription" product using search function
		When I Click on "Add to cart" link
		And I Select Subscription as "Single Purchase"
		And I Click on "Proceed to Cart" link
   	Then  I Verify "2" item is added to the cart
   	And I Click on "Remove Item" link
   	Then  I Verify "1" item is added to the cart
  
 # @checkout @cart @smoke @regression @TC_005
 # Scenario: As a guest user ensure user able to add two OMV Items and remove one of them
 #   Given I add OMV Subscription product into cart with frequency of "3months"
 #   And  I add OMV Non Subscription Product into cart
 #   And I will have "2" items in cart
 #   When I removed first item from the cart list
 #   Then I will have "1" items in cart
   	
  @checkout @cart @smoke @regression @TC_006 
	Scenario: As a guest user, ensure you able to apply a promo code for an OMV non subscription product
   	Given I Find "OMV Subscription" product using search function
   	And  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link
		And I Select Subscription as "Single Purchase"
		And I Click on "Proceed to Cart" link
   	Then  I Verify "1" item is added to the cart
   	When I Enter Promocode "SPRINGS" under Promo Edit box 
   	And I Click on "Apply" button
   	Then I Should see a validation message saying You used promotion code "SPRINGS" and Discount and Total price should reflect
   	
 	@checkout @cart @smoke @regression @TC_007 
	Scenario: As a guest user, ensure you able to apply a promo code for an OMV non subscription product
   	Given I Find "OMV Subscription" product using search function
   	And  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link
		And I Select Subscription as "Single Purchase"
		And I Click on "Proceed to Cart" link
   	Then  I Verify "1" item is added to the cart
   	When I Enter Promocode "SPRINGS" under Promo Edit box 
   	And I Click on "Apply" button
   	And I Click on "Cancel" button
   	Then I verify "You canceled the promotion code." is displayed
   	
   	
  @checkout @cart @smoke @regression @TC_008 
	Scenario: As a guest user, ensure Save for Later should not allow you to save anything for later
   	Given I Find "OMV Subscription" product using search function
   	And  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link
		And I Select Subscription as "Single Purchase"
		And I Click on "Proceed to Cart" link
   	Then  I Verify "1" item is added to the cart
   	When I Enter Promocode "SPRINGS" under Promo Edit box 
   	And I Click on "Apply" button
   	And I Click on "Cancel" button
   	Then I verify "You canceled the promotion code." is displayed

  @checkout @cart @smoke @regression @TC_009
  Scenario: As a guest user ensure system allow you to add Items from Recommended based on your cart after adding HA OMD product
    Given I enter OMD HA Innovel product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMD HA Innovel product displays in search results page
    When  I will enter zipCode for checking the delivery availability for OMD HA Innovel Product
    Then  I click on Add to Cart Button under Recommendations

 @checkout @cart @smoke @regression @TC_010  
	Scenario: As a guest user, ensure system able to trigger an error message when shipping zip code is invalid
   	Given I Find "OMD HA Innovel" product using search function
   	And  I will verify "OMD HA Innovel" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link
		And I enter zipCode to check the delivery availability for "OMD HA Innovel" product
		And I Enter an invalid zip code "111111" under Shipping zip code Field 
		And I Click on "Check" button
		Then I verify "Please enter a valid ZIP code (For example 90602)." is displayed
		
	@checkout @cart @smoke @regression @TC_011  
	Scenario: As a Guest user, ensure system able to trigger an error message when promo code is invalid
   	Given I Find "OMD HA Innovel" product using search function
   	And  I will verify "OMD HA Innovel" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link
		And I enter zipCode to check the delivery availability for "OMD HA Innovel" product
		When I Enter Promocode "STRINGS" under Promo Edit box 
   	And I Click on "Apply" button
		Then I verify "The promotion code \"STRINGS\" is not valid" is displayed

  @checkout @cart @smoke @regression @TC_022
  Scenario: As a guest user ensure that Add accessories button is displayed for the product
    Given I enter OMD HA Innovel product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMD HA Innovel product displays in search results page
    And   I click on Add to Cart Button under Accessories
 
  @checkout @cart @smoke @regression @TC_023 
	Scenario: As a guest user , ensure that user is able to add product from Add accessories pop up 
   	Given I Find "OMV Non Subscription With Accessories" product using search function
   	And  I will verify "OMV Non Subscription With Accessories" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link
		And I Click on "View cart" link
		And I Click on "Add Accessories" button
		Then I verify "Recommended Accessories" is displayed
		When I Click on "Close Add Accessories" button
		Then I verify "Recommended Accessories" is not displayed
		And I Click on "Add Accessories" button
		Then I verify "Recommended Accessories" is displayed
    And I Click on "Add to cart" button for the first Accessory
    Then I verify "Your Cart" is displayed
    When I Click on "Add Accessories" button
    Then I verify "Recommended Accessories" is displayed
    And I verify the Accesory added to cart is still displayed

  @checkout @cart @smoke @regression @TC_024
  Scenario: As a guest user ensure that Add accessories button is displayed for the product
    Given I enter OMD HA Innovel product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMD HA Innovel product displays in search results page
    And   I click on Add to Cart Button under Accessories
    Then  I click on Remove Item Button


package stepDef;

import base.GenericFunctions;
import base.GlobalTestData;
import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Cart_page;
import pageObject.PLP_page;
import pageObject.Search_page;

import java.text.ParseException;

import org.testng.Assert;

public class Cart_Steps extends Setup {
	Cart_page CART = new Cart_page(driver);
	Search_page SEARCH = new Search_page(driver);
	PLP_page PLP = new PLP_page(driver);
	public static String initialPrice = "";
	public String qty = "";
	public String tax1 = "";
	public String tax2 = "";
	public static String[] priceBreakdown;
	public static String firstAccessory="";

	@SuppressWarnings("static-access")
	@When("I enter zipCode to check the delivery availability")
	public void iEnterZipCodeToCheckTheDeliveryAvailability() throws InterruptedException {
		CART.verifyZipCodePage();
		CART.verifySelectedProduct(CART.productCode[0]);
		CART.productArea = CART.validateEnterZipCode();
		CART.clickProceedButton();
	}
	
	@SuppressWarnings("static-access")
	@When("I will enter zipCode to check the delivery availability")
	public void iEnterZipCodeTheDeliveryAvailability() throws InterruptedException {
		CART.verifySelectedProduct(CART.productCode[0]);
		CART.productArea = CART.validateEnterZipCode();
	}

	@When("^I enter zipCode to check the delivery availability for \"([^\"]*)\"$")
	public void iZipCodeToCheckTheDeliveryAvailability(String stateName) throws InterruptedException {
		CART.verifySelectedProduct(CART.productCode[0]);
		CART.productArea = CART.validateEnterZipCode(stateName);
	}

	@When("I will enter zipCode for checking the delivery availability for OMD HE Innovel Product")
	public void iZipCodeToCheckTDeliveryAvailability() throws InterruptedException {
		CART.clickAddCartButton();
		CART.verifyZipCodePage();
		CART.verifySelectedProduct(GlobalTestData.OMD_HE_Innovel);
		CART.productArea = CART.validateEnterZipCode();
		Thread.sleep(500);
		CART.clickProceedButton();
	}

	@When("I will enter zipCode for checking the delivery availability for OMD HA Innovel Product")
	public void iZipCodeCheckTDeliveryAvailability() throws InterruptedException {
		CART.clickAddCartButton();
		CART.verifyZipCodePage();
		CART.verifySelectedProduct(GlobalTestData.OMD_HA_Innovel);
		CART.productArea = CART.validateEnterZipCode();
		//Thread.sleep(100);
		CART.clickProceedButton();
	}

	@When("I will enter zipCode for checking the delivery availability for OMD Klarna enabled Product")
	public void iZipCodeDeliveryAvailability() throws InterruptedException {
		CART.clickAddCartButton();
		CART.verifyZipCodePage();
		CART.verifySelectedProduct(GlobalTestData.OMD_KLARNA);
		CART.productArea = CART.validateEnterZipCode();
		CART.clickProceedButton();
	}

	@When("I will enter zipCode for checking the delivery availability for OMD HE Non Innovel Product")
	public void iZipCodeCheckDeliveryAvailability() throws InterruptedException {
		CART.clickAddCartButton();
		CART.clickProceedCart();
	}

	@SuppressWarnings("static-access")
	@Then("I will verify product is added into Cart Page")
	public void iWillSeeProductWillBeAddedIntoCartPage() {
		CART.verifyCartPage();
		CART.verifyProductDetails(CART.productCode[0], Cart_Steps.initialPrice);
		CART.verifyHelpSection();
	}

	@When("I click on Secure Checkout button")
	public void iClickOnSecureCheckoutButton() {
		CART.clickSecureCheckOut();
	}

	@And("I click on Continue as Guest from Sign in page")
	public void iClickOnContinueAsGuestFromSignInPage() {
		CART.verifySignInPage();
		CART.clickContinueAsGuest();
	}

	@When("I will enter promo code")
	public void I_will_enter_promocode() throws InterruptedException {
		CART.enterPromoCode(GlobalTestData.PROMO_CODE);
		CART.clickApplyButton();
	}

	@Then("I should able to use promo code")
	public void I_should_able_to_use_promo_code() throws InterruptedException {
		CART.verifyPromoCode();
	}

	@When("I will remove promo code")
	public void I_will_remove_promocode() throws InterruptedException {
		CART.clickRemovePromoCode();
	}

	@Then("I should able to remove promo code")
	public void I_should_able_to_remove_promo_code() throws InterruptedException {
		CART.verifyRemovePromoCode();
	}

	@When("^I will select the \"([^\"]*)\" as quantity$")
	public void I_will_select_quantity(String quantity) throws InterruptedException {
		/*
		 * if (initialPrice.equalsIgnoreCase("")) { initialPrice = CART.getPrice(); }
		 */
		CART.selectQuantity(quantity);
		qty = quantity;
	}

	@When("I should able to see the updated price as per quantity")
	public void iVerifyPrice() throws InterruptedException {
		CART.verifyPrice(initialPrice, qty);
	}

	@And("I should be able to see Estimated Price and Order Total")
	public void VerifyPrice() throws InterruptedException {
		CART.verifyEstimatedTax();
		CART.verifyTotalTax();
	}

	@And("I should be able to see Estimated Tax Price")
	public void VerifyEstimatedTax() throws InterruptedException {
		CART.verifyEstimatedTax();
		if (tax1.equalsIgnoreCase("")) {
			tax1 = CART.getEstimatedTax();
		} else {
			tax2 = CART.getEstimatedTax();
		}
	}
	
	@Then("I should able see Hawaii estimated tax less than New York estimated tax")
	public void CompareEstimatedTax() throws InterruptedException {
	CART.compareEstimatedTax(tax1, tax2);	
	}

	@Then("I click on Add to Cart Button under Recommendations")
	public void clickAddCart() throws InterruptedException {
		CART.clickAddCartRecommendation();
	}

	@And("I click on Add to Cart Button under Accessories")
	public void clickAddToCart() throws InterruptedException {
		CART.clickAddCartAccessories();
	}

	@Then("I click on Remove Item Button")
	public void clickRemoveItem() throws InterruptedException {
		CART.clickRemoveItem();
	}

	@And("I will update the Delivery Frequency date to sixMonths")
	public void iWillUpdateTheDeliveryFrequencyDateToMonths() {
		CART.enterDeliveryFrequency("6 months");
	}

	@When("I will accept the alert")
	public void iWillAcceptTheAlert() throws InterruptedException {
		CART.acceptAlert();

	}

	@Then("I should see the updated Delivery Frequency date is reflected")
	public void iShouldSeeTheUpdatedDeliveryFrequencyDateIsReflected() {
		CART.verifySixMonthsDeliveryFrequencyIsSelected();
	}
	@Given("I enter OMV subscription product Code into search edit box from GNB")
	public void iSearchForOMVSubscriptionProductFromGNB() {
		SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMV_Subscription);
	}

	@And("I add OMV Non Subscription Product into cart")
	public void iWillAddOMVNonSubscriptionProductIntoCart() throws InterruptedException, ParseException {
		SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMV_Non_Subscription);
		SEARCH.clickSearchIconFromGNB();
		SEARCH.addCartProduct(GlobalTestData.OMV_Non_Subscription);
		SEARCH.clickViewCartButtonFromModal();
	}

	@Then("^I add OMV Subscription product into cart with frequency of \"([^\"]*)\"$")
	public void iAddOMVSubscriptionProductIntoCart(String frequency) throws InterruptedException, ParseException {
		SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMV_Subscription);
		SEARCH.clickSearchIconFromGNB();
		SEARCH.addCartProduct(GlobalTestData.OMV_Subscription);
		CART.productCode[0]=GlobalTestData.OMV_Subscription;
		PLP.selectSubscription(frequency);
		PLP.clickProceedButton();
	}

	@And("^I will have \"([^\"]*)\" items in cart$")
	public void iWillHaveTwoItemsInCart(String itemCounts) throws InterruptedException {
		CART.verifyItemCountsInCartPage(itemCounts);
	}

	@When("I removed first item from the cart list")
	public void iRemovedFirstItemFromTheCartList() throws InterruptedException {
		CART.clickRemoveItemLink();
	}
	
	
	@When("I Verify {string} item is added to the cart")
	public void clickAddToCartButton(String noOfItems) throws InterruptedException {
		CART.validateItemAddedToCart(noOfItems);

	}
	
	@And("I Click on {string} link/button")
	public void removeItem(String linkName) throws InterruptedException {
		CART.click(linkName);
	}
	
	@Then("Your cart is Empty messge should display along with SEE ALL DEALS button")
	public void yourCartIsEmptyMessageshouldbeDisplayed() {
		CART.verifyEmptyCartMessage();
	}
	
	@And("I Select Subscription as {string}")
	public void selectSubscriptionype(String subscriptionType) throws InterruptedException {
		CART.click(subscriptionType);
	}
	
	@And("I Input zipcode on price breakdown section and veirfy estimated tax is calculated")
	public void inputZIPCodeinPriceBreakdown() throws InterruptedException {
		priceBreakdown = CART.inputZipcodeVerifyPriceBreakdown(CART.productArea);
	}
	
	@And("I Input zipcode {string} on price breakdown section and veirfy estimated tax is calculated")
	public void inputZIPCodeVerifyPriceBreakdown(String zip) throws InterruptedException {
		priceBreakdown = CART.inputZipcodeVerifyPriceBreakdown(zip);
	}
	
	
	@Then("I verify Order summay section price break down is correct")
	public void verifyPriceBreakdown() {
		Assert.assertEquals(CART.CART_PRODUCTPRICE.getText(), CART.CART_AMOUNTS.get(0).getText());
	}
	
	@When("I Enter Promocode {string} under Promo Edit box")
	public void enterPromocode(String promocode) {
		CART.enterPromoCode(promocode);
	}

	@Then("I Should see a validation message saying You used promotion code {string} and Discount and Total price should reflect")
	public void verifyPromocode(String promo) {
		CART.validateApplyPromocode(promo);
	}
	
	@Then("I verify {string} is displayed")
	public void verifyPromoCancelled(String message) {
		CART.validateCancelPromocode(message);
		
	}
	
	@Then("I verify {string} is not displayed")
	public void verifyElementNotDisplayed(String text) throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(GenericFunctions.verifyElementIsNotDisplayedByText(text));
		
	}
	
	@And("I Enter an invalid zip code {string} under Shipping zip code Field")
	public void enterInvalidShippingZipCode(String zip) {
		CART.enterZipCode(zip);
		
	}
	
	@SuppressWarnings("static-access")
	@When("I enter zipCode to check the delivery availability for {string} product")
	public void iEnterZipCodeToCheckTheDeliveryAvailabilityfor(String product) throws InterruptedException {
		CART.verifyZipCodePage();
		CART.verifySelectedProduct(GenericFunctions.getData(product));
		CART.productArea = CART.validateEnterZipCode();
		CART.clickProceedButton();
	}
	
	@And("I Click on {string} button for the first Accessory")
	public void recordFirstAccessoryAndAddToCart(String linkName) throws InterruptedException {
		firstAccessory= CART.readFirstAccessory();
		CART.click("AddAccessoryToCart");
	}
	
	@And("I verify the Accesory added to cart is still displayed")
	public void verifyAccessoryisDisplayed() throws InterruptedException {
		String accessory = CART.readFirstAccessory();
		firstAccessory= CART.readFirstAccessory();
		Assert.assertEquals(accessory, firstAccessory);
	}
	
	@Then("I verify Price Breakdown Order Summary section on cart page")
	public void verifyOrderSummaryPriceBreakdown() throws InterruptedException {
		CART.verifyPriceBreakdown();
	}
	
	@When("I update product quantity to {string}")
	public void updateProductQuantity(String qty) throws InterruptedException {
		CART.updateProductQuantity(qty);
	}
	
}

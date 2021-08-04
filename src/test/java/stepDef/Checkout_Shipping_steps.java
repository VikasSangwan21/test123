package stepDef;


import base.GenericFunctions;
import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Checkout_Shipping_page;


public class Checkout_Shipping_steps extends Setup {
	Checkout_Shipping_page Shipping = new Checkout_Shipping_page(driver);


	@And("I click on Save and Continue button after fill out Shipping Info")
	public void iClickOnSaveAndContinueButtonAfterFillOutShippingInfo() throws InterruptedException {
		Shipping.verifyContactInfoPage();
		Shipping.enter_contact_shipping_info();
		Shipping.clickSaveAndContinueButtonFromShippingPage();
	}

	@And("I verify the suggested address")
	public void iVerifyTheSuggestedAddress() throws InterruptedException {
		Shipping.clickUseThisAddressButton();
	}
	
	@Then("^I will select the \"([^\"]*)\" shipment Method$")
	public void iwillselectshipmentMethod(String shippingMethod) throws InterruptedException {
		Shipping.selectShippingMethod(shippingMethod);
	}
	
	@When("I click on Continue to Payment button")
	public void iClickOnContinueToPaymentButton() throws InterruptedException {
		Shipping.verifyShippingInfoPage();
		Shipping.clickContinuePaymentButtonFromShippingPage();
	}

	
	@And("I click {string} button on checkout page")
	public void useADifferentBillingAddress(String linkName) throws InterruptedException {
		Shipping.click(linkName);
	}
	
	@And("I enter different Address in Use a different billing address section")
	public void enterDifferentAddress() throws InterruptedException {
		Shipping.enterNewAddressOnPaymentPage();
	}
	
	@And("I edit the address and click on Save and Continue")
	public void updateAddress() throws InterruptedException {
		Shipping.verifyContactInfoPage();
		Shipping.update_shipping_info();
		Shipping.clickSaveAndContinueButtonFromShippingPage();
	}
	
	@And("I verify System should navigate the Shipping page")
	public void verifyShippingPage() throws InterruptedException {
		Shipping.verifyContactInfoPage();
	}


}

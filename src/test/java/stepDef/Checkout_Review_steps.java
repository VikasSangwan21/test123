package stepDef;


import base.GenericFunctions;
import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Checkout_Review_page;

public class Checkout_Review_steps extends Setup {
	Checkout_Review_page  Review = new Checkout_Review_page(driver);
	
	
	@And("I click on Place Order button after agreeing Terms and Conditions from Review Page")
	public void iClickOnTermsAndConditionsCheckbox() throws InterruptedException {
		Review.clickTermsConditionsFromReviewPage();
		Review.clickPlaceOrderButtonFromReviewPage();
	}
	
	@Then("I verify user is on Review and Place order page and all the details are displayed correctly")
	public void verifyUseIsOnReviewAndPlaceOrderPage() throws InterruptedException {
		GenericFunctions.verifyElementByText("Please review your order. Your order will not be placed until you click ");
		Review.verifyShippingAddress();
		Review.verifyContactInformation();
		Review.verifyNewBillingAddress();
		Review.verifyPaymentMethod();
		Review.verifyOrderSummarySection();
		GenericFunctions.verifyElementByText("Edit Cart");
		Review.verifyCheckboxes();
	}
	
	
	@Then("I verify shipping Address on Checkout page")
	public void verifyShippingAddress() throws InterruptedException {
		Review.verifyShippingInfo();
	}
	
	@Then("I verify shipping address is updated")
	public void verifyUpdatedShippingAddress() throws InterruptedException {
		Review.verifyUpdatedBillingAddress();
	}
	
	@When("I click {string} button on Checkout Review Page")
	public void click(String linkName) throws InterruptedException {
		Review.click(linkName);
	}
}

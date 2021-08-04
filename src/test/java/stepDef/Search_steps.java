package stepDef;

import java.text.ParseException;

import base.GenericFunctions;
import base.GlobalTestData;
import base.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Cart_page;
import pageObject.Search_page;


public class Search_steps extends Setup {
    Search_page SEARCH = new Search_page(driver);
    Cart_page CART = new Cart_page(driver);

    @When("I click on search icon from GNB")
    public void iClickOnSearchIconFromGNB() throws InterruptedException {
        SEARCH.clickSearchIconFromGNB();
    }

    @Given("I enter OMV subscription product Code into search edit box from Search Results Page")
    public void searchForSubscriptionProductFromSearchResultsPage() {
        SEARCH.searchForItemFromSearchResultsPage(GlobalTestData.OMV_Subscription);
    }

    @Given("I enter OMV non subscription product Code into search edit box from Search Results Page")
    public void searchForNonSubscriptionProductFromSearchResultsPage() {
        SEARCH.searchForItemFromSearchResultsPage(GlobalTestData.OMV_Non_Subscription);
    }

    @Given("I enter OMD HE Innovel product Code into search edit box from Search Results Page")
    public void searchForInnovelProductFromSearchResultsPage() {
        SEARCH.searchForItemFromSearchResultsPage(GlobalTestData.OMD_HE_Non_Innovel);
    }

    @Given("I enter OMD HA Non Innovel product Code into search edit box from Search Results Page")
    public void searchForOmdHaNonInnovelProductFromSearchResultsPage() {
        SEARCH.searchForItemFromSearchResultsPage(GlobalTestData.OMD_HA_Non_Innovel);
    }

    @Given("I enter OMV Non subscription product Code into search edit box from GNB")
    public void iEnterForOMVNonSubscriptionProductCodeIntoSearchEditBoxFromGNB() {
        SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMV_Non_Subscription);
    }

    @Given("I enter invalid wording into search edit box from GNB")
    public void enterInvalidValueToSearch() {
        SEARCH.enterAnItemToSearchFromGNB("Asfdadfasdfasdf");
    }

    @Given("I enter special characters into search edit box from GNB")
    public void enterSpecialCharactersToSearch() {
        SEARCH.enterAnItemToSearchFromGNB("%^$&*!@#[]{}*()+-.");
    }
    
    @Given("I enter OMD HE Innovel product Code into search edit box from GNB")
    public void iSearchForOMDHESubscriptionProductFromGNB() {
        SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMD_HE_Innovel);
    }
    
    @Given("I enter OMD HA Innovel product Code into search edit box from GNB")
    public void iSearchForOMDHAInnovelSubscriptionProductFromGNB() {
        SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMD_HA_Innovel);
    }
    
    @Given("I enter OMD HE Non Innovel product Code into search edit box from GNB")
    public void iSearchForOMDHENonInnovelSubscriptionProductFromGNB() {
        SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMD_HE_Non_Innovel);
    }
    
    @Given("I enter OMD Klarna enabled product Code into search edit box from GNB")
    public void iSearchForOMDKlarnaProductFromGNB() {
        SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMD_KLARNA);
    }

    @Then("I will verify OMV Subscription product displays in search results page")
    public void iWillVerifyOMVSubscriptionProductDisplaysInSearchResultsPage() {
        SEARCH.verifySearchedItemFromSearchResultPage(GlobalTestData.OMV_Subscription);
    }

    @Then("I will verify OMV Non Subscription product displays in search results page")
    public void iWillVerifyOMVNonSubscriptionProductDisplaysInSearchResultsPage() {
        SEARCH.verifySearchedItemFromSearchResultPage(GlobalTestData.OMV_Non_Subscription);
    }

    @Then("I will verify We Are Sorry error message")
    public void iWillVerifyWeAreSorryErrorMessage() {
        SEARCH.verifyWeAreSorryMessageInSearchResultsPage();
    }

    @Then("I will verify OMD HE Innovel product displays in search results page")
    public void iWillVerifyOMDHESubscriptionProductDisplaysInSearchResultsPage() {
        SEARCH.verifySearchedItemFromSearchResultPage(GlobalTestData.OMD_HE_Innovel);
    }
    
    @Then("I will verify OMD HA Innovel product displays in search results page")
    public void iWillVerifyOMDHASubscriptionProductDisplaysInSearchResultsPage() {
        SEARCH.verifySearchedItemFromSearchResultPage(GlobalTestData.OMD_HA_Innovel);
    }
    
    @Then("I will verify OMD HE Non Innovel product displays in search results page")
    public void iWillVerifyOMDHENonInnovelSubscriptionProductDisplaysInSearchResultsPage() {
        SEARCH.verifySearchedItemFromSearchResultPage(GlobalTestData.OMD_HE_Non_Innovel);
    }
    
    @Then("I will verify OMD Klarna enabled product displays in search results page")
    public void iWillVerifyOMDKlarnaProductDisplaysInSearchResultsPage() {
        SEARCH.verifySearchedItemFromSearchResultPage(GlobalTestData.OMD_KLARNA);
    }

    @Given("I enter OMD HA Non Innovel product Code into search edit box from GNB")
    public void iEnterOMDHANonInnovelProductCodeIntoSearchEditBoxFromGNB() {
        SEARCH.enterAnItemToSearchFromGNB(GlobalTestData.OMD_HA_Non_Innovel);
    }

    @Then("I will verify OMD HA Non Innovel product displays in search results page")
    public void iWillVerifyOMDHANonInnovelProductDisplaysInSearchResultsPage() {
        SEARCH.verifySearchedItemFromSearchResultPage(GlobalTestData.OMD_HA_Non_Innovel);
    }

    @Given("I search for OLED TV")
    public void iSearchForOLEDTv() {
        SEARCH.enterAnItemToSearchFromGNB("oled tv");
    }
   
    @Then("^I will click on add to cart Button from Search Results Page for \"([^\"]*)\"$")
	public void iWillClickOnAddToCartPage(String productSubscription) throws ParseException, InterruptedException {
	 if(productSubscription.equalsIgnoreCase("OMV_Subscription")) {
     SEARCH.addCartProduct(GlobalTestData.OMV_Subscription);
	 CART.productCode[0]=GlobalTestData.OMV_Subscription;
	 } else if(productSubscription.equalsIgnoreCase("OMD_HE_Innovel")) {
	 SEARCH.addCartProduct(GlobalTestData.OMD_HE_Innovel);
	 CART.productCode[0]=GlobalTestData.OMD_HE_Innovel;
	 }else if(productSubscription.equalsIgnoreCase("OMV_Non_Subscription")) {
		 SEARCH.addCartProduct(GlobalTestData.OMV_Non_Subscription);
		 CART.productCode[0]=GlobalTestData.OMV_Non_Subscription;
	 }
 }
    
    @Given("^I search for \"([^\"]*)\"$")
    public void iSearchProduct(String productName) {
        SEARCH.enterAnItemToSearchFromGNB(productName);
    }
    
    @Then("^I will verify list of \"([^\"]*)\" in my search results page$")
    public void iWillVerifyListOfOledTvInMySearchResultsPage(String productName) throws ParseException, InterruptedException {
    	SEARCH.verifyProductName(productName);
    }


    @When("I click on search icon from search results page")
    public void iClickOnSearchIconFromSearchResultsPage() throws InterruptedException {
        SEARCH.clickSearchIconFromSearchResultsPage();
    }
    
    
    
    @Given("I Find {string} product using search function")
    public void iSearchItem(String item) throws InterruptedException {
        SEARCH.enterAnItemToSearchFromGNB(GenericFunctions.getData(item));
        SEARCH.clickSearchIconFromGNB();
    }
    
    @Then("I will verify {string} product displays in search results page and navigate to PDP page")
    public void verifyProductDisplayedOnResultsPage(String item) {
    	SEARCH.verifySearchedItemFromSearchResultPage(GenericFunctions.getData(item));
    	SEARCH.navigateToPDP(GenericFunctions.getData(item));
 }
   
}

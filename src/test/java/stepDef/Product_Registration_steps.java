package stepDef;

import java.text.ParseException;

import base.GenericFunctions;
import base.GlobalTestData;
import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Cart_page;
import pageObject.Product_Registration_page;
import pageObject.Search_page;
import pageObject.Support_page;


public class Product_Registration_steps extends Setup {
    Product_Registration_page REGISTRATION = new Product_Registration_page(driver);

    @When("I enter product Details on product registration page and click register a product button")
    public void iClickOnSearchIconFromGNB(String product) throws InterruptedException {
    	REGISTRATION.enterProductInfo();
    }
    
   
}

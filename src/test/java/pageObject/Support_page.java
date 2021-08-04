package pageObject;

import base.GenericFunctions;
import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import java.text.ParseException;
import java.time.Duration;
import java.util.List;

public class Support_page extends Setup {

	public Support_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
			.pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);

	@FindBy(how = How.ID, using = "search-keyword")
	public WebElement SEARCH_EDIT_BOX;
	@FindBy(how = How.XPATH, using = "//*[@id='search-keyword']//following-sibling::input")
	public WebElement SEARCH_ICON_CLICK;
	@FindBy(how = How.XPATH, using = "//a[@aria-labelledby='majorCategory_label']")
	public WebElement PRODUCT_CATEGORY;
	@FindBy(how = How.XPATH, using = "//a[@aria-labelledby='subCategory_label']")
	public WebElement PRODUCT_SUBCATEGORY;
	@FindBy(how = How.XPATH, using = "(//a[@class='ga-model-detail visual']/img[1])[1]")
	public WebElement FIRST_RESULT;
	@FindBy(how = How.XPATH, using = "//a[@data-link-area=\"cs_product_support_link\" and text()='Register a Product']")
	public WebElement REGISTER_A_PRODUCT;
	
	@FindBy(how = How.XPATH, using = "//h2/strong")
	public WebElement SEARCH_WE_ARE_SORRY_MSG;
	@FindBy(how = How.ID, using = "search-keyword")
	public WebElement SEARCH_INPUT_FROM_SEARCH_RESULTS_PAGE;
	@FindBy(how = How.XPATH, using = "//*[@id='search_for']/div/input")
	public WebElement SEARCH_ICON_FROM_SEARCH_RESULTS_PAGE;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'VIEW CART')]")
	public WebElement SEARCH_VIEW_CART_FROM_MODAL;


	public void searchProduct(String searchMe) {
		wait.until(ExpectedConditions.elementToBeClickable(SEARCH_EDIT_BOX));
		SEARCH_EDIT_BOX.clear();
		SEARCH_EDIT_BOX.sendKeys(searchMe);
	}
	
	public void clickSearch() throws InterruptedException {
		GenericFunctions.jsClick(SEARCH_ICON_CLICK);
	}
	
	public void click(String text) throws InterruptedException {
		GenericFunctions.jsClick(driver.findElement(By.xpath("(//*[.='"+text+"'])[1]")));
	}
	
	public void selectCategories(String Category, String SubCategory) throws InterruptedException {
		GenericFunctions.jsClick(PRODUCT_CATEGORY);
		GenericFunctions.jsClick(driver.findElement(By.xpath("(//li[contains(text(), '"+Category+"')])[1]")));
		GenericFunctions.jsClick(PRODUCT_SUBCATEGORY);
		GenericFunctions.jsClick(driver.findElement(By.xpath("(//li[contains(text(), '"+SubCategory+"')])[1]")));
		
	}

	
}

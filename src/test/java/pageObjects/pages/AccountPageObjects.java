package pageObjects.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.qameta.allure.Step;
import pageObjects.initializePageObjects.PageFactoryInitializer;

public class AccountPageObjects extends PageFactoryInitializer {

	@FindBy(xpath = "//a[text()=\"Get started now\"]")
	private List<WebElement> getStarted;

	@FindBy(css = "#company_name")
	private WebElement companyName;

	@FindBy(css = "#nature_and_purpose")
	private WebElement natureandpurpose;

	@FindBy(css = "#merchant_category_code")
	private WebElement merchantCategory;

	@FindBy(css = "#landline")
	private WebElement landline;

	@FindBy(css = "#address_line1")
	private WebElement address_line1;

	@FindBy(css = "#address_line2")
	private WebElement address_line2;

	@FindBy(css = "#city")
	private WebElement city;

	@FindBy(css = "#post_code")
	private WebElement postcode;

	@FindBy(css = "#region_id")
	private WebElement regionid;

	@FindBy(xpath = "//a[text()=\"I already have a reader\"]")
	private WebElement alreadyHaveReader;

	@FindBy(xpath = "//span[contains(.,\"Yes, cancel order\")]")
	private WebElement cancelOrder;

	@FindBy(xpath = "//button[contains(.,\"Add business information\")]")
	private WebElement addBusinessInfo;

	@FindBy(xpath = "//button[text()=\"Continue\"]")
	private WebElement Continue;

	@Step("Enter companyName")
	public void enterCompanyName(String mail) throws Exception {
		companyName.clear();
		companyName.sendKeys(mail);
	}

	@Step("Enter nature and purpose")
	public void enterNatureandpurpose(String mail) throws Exception {
		natureandpurpose.clear();
		natureandpurpose.sendKeys(mail);
	}

	@Step("Enter phone no ")
	public void enterPhoneNumber(String number) throws Exception {
		landline.clear();
		landline.sendKeys(number);
	}
	
	@Step("Enter address 1 ")
	public void enterAdrressOne(String address) throws Exception {
		address_line1.clear();
		address_line1.sendKeys(address);
	}
	
	@Step("Enter city ")
	public void enterCity(String cname) throws Exception {
		city.clear();
		city.sendKeys(cname);
	}
	
	@Step("Enter zipcode ")
	public void enterZipCode(String zcode) throws Exception {
		postcode.clear();
		postcode.sendKeys(zcode);
	}

	@Step("Select Legal Type")
	public void selectLegalType(String type) throws Exception {
		driver.findElement(By.xpath("//label[contains(.,'" + type + "')]")).click();
	}

	@Step("Select Legal Type")
	public void selectRegion(String region) throws Exception {
		Select category = new Select(regionid);
		category.selectByVisibleText(region);
	}

	@Step("Select merchant Category")
	public void selectMerchantCategory(String categoryName) throws Exception {
		Select category = new Select(merchantCategory);
		category.selectByVisibleText(categoryName);
	}

	@Step("Click Continue")
	public void clickContinue() throws Exception {
		Continue.click();
	}
}
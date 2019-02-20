package pageObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.qameta.allure.Step;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.ExplicitWaiting;

public class SignUpPageObjects extends PageFactoryInitializer {

	@FindBy(xpath = "//button[text()=\"Create an account\"]")
	private WebElement createAccount;

	@FindBy(css = "#countrySelect")
	private WebElement country;

	@FindBy(css = "#email")
	private WebElement email;

	@FindBy(css = "#password")
	private WebElement password;

	@FindBy(css = "#username")
	private WebElement uname;

	@FindBy(xpath = "//*[text()=\"Continue\"]")
	private WebElement Continue;

	@FindBy(xpath = "//div[text()=\"Login\"]")
	private WebElement login;

	@FindBy(xpath = "//a[text()=\"I already have a reader\"]")
	private WebElement alreadyHaveReader;

	@FindBy(xpath = "//span[contains(.,\"Yes, cancel order\")]")
	private WebElement cancelOrder;

	@FindBy(xpath = "//button[contains(.,\"Add business information\")]")
	private WebElement addBusinessInfo;
	
	@FindBy(xpath = "//h2[text()=\"Welcome to your personal Dashboard\"]")
	private WebElement dashboardLabel;

	@Step("Enter email")
	public void enterEmail(String mail) throws Exception {
		email.clear();
		email.sendKeys(mail);
	}

	@Step("Enter password")
	public void enterPassword(String pwd) throws Exception {
		password.clear();
		password.sendKeys(pwd);
	}

	@Step("Click Create an account")
	public void clickCreateAccount() throws Exception {
		createAccount.click();
	}

	@Step("Click Continue")
	public void clickContinue() throws Exception {
		Continue.click();
	}

	@Step("Click alreadyHaveReader")
	public void clickalreadyHaveReader() throws Exception {
		alreadyHaveReader.click();
	}

	@Step("Click cancelOrder")
	public void clickcancelOrder() throws Exception {
		cancelOrder.click();
	}

	@Step("Click addBusinessInfo")
	public void clickaddBusinessInfo() throws Exception {
		addBusinessInfo.click();
	}

	@Step("Click login")
	public void clickLogin() throws Exception {
		login.click();
	}

	@Step("Select Country")
	public void selectCountry(String cname) throws Exception {
		Select cdropdown = new Select(country);
		cdropdown.selectByVisibleText(cname);
	}

	@Step("Enter email and Pwd to login")
	public SignUpPageObjects signIn() throws Exception {
		uname.sendKeys(Username);
		password.sendKeys(Password);
		clickLogin();
		ExplicitWaiting.explicitWaitVisibilityOfElement(dashboardLabel, 30);
		return this;
	}

}

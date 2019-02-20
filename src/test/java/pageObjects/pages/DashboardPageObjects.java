package pageObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.ExplicitWaiting;

public class DashboardPageObjects extends PageFactoryInitializer {

	@FindBy(css = "a[title=\"Transactions\"]")
	private WebElement transactions;

	@FindBy(xpath = "//h2[text()=\"We couldn’t find anything that matches your search.\"]")
	private WebElement noTransaction;

	@Step("Click Transaction")
	public void clickTransactions() throws Exception {
		ExplicitWaiting.explicitWaitElementToBeClickable(transactions, 30);
		ExplicitWaiting.explicitWaitVisibilityOfElement(transactions, 30);
		transactions.click();
	}

	@Step("Verify no transactions available ")
	public boolean verifyNoTransactions() throws Exception {
		return noTransaction.isDisplayed();
	}

}

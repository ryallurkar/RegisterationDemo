package pageObjects.initializePageObjects;

import org.openqa.selenium.support.PageFactory;

import controllers.BaseMethod;
import pageObjects.pages.AccountPageObjects;
import pageObjects.pages.DashboardPageObjects;
import pageObjects.pages.SignUpPageObjects;

public class PageFactoryInitializer extends BaseMethod {
	
	public AccountPageObjects accountPage() {
		return PageFactory.initElements(getWebDriver(), AccountPageObjects.class);
	}
	
	public SignUpPageObjects signUpPage() {
		return PageFactory.initElements(getWebDriver(), SignUpPageObjects.class);
	}
	
	public DashboardPageObjects dashboardPage() {
		return PageFactory.initElements(getWebDriver(), DashboardPageObjects.class);
	}
}

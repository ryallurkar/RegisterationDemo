package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.RandomGenerator;

public class RegisterCompany extends PageFactoryInitializer {

	@Description("Verify customer can successfully register on platform")
	public void testSuccessfulRegistratio() throws Exception {
		signUpPage().clickCreateAccount();
		signUpPage().selectCountry("United States");
		signUpPage().clickContinue();
		signUpPage().enterEmail(RandomGenerator.GenerateRandomEMAILIDs()); 
		signUpPage().enterPassword("TestingIsFun123");
//		God Bless Captcha
		signUpPage().clickContinue();
		signUpPage().clickalreadyHaveReader();
		signUpPage().clickcancelOrder();
		signUpPage().clickaddBusinessInfo();
		accountPage().selectLegalType("Sole trader");
		accountPage().enterCompanyName("TestCompany");
		accountPage().selectMerchantCategory("Bar / Club");
		accountPage().enterAdrressOne("dummy address");
		accountPage().enterCity("hawaii");
		accountPage().enterZipCode("96701");
		accountPage().selectRegion("Hawaii");
		accountPage().clickContinue();
	}
	
	@Test(priority = 0)
	@Description("Verify no transactions in user dashboard")
	public void testNoTransaction() throws Exception {
		signUpPage().signIn();
		dashboardPage().clickTransactions();
		Assert.assertTrue(dashboardPage().verifyNoTransactions(),"Transactions available");

	}
	
}
package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountsTest extends BaseTest {
    protected final static String ACCOUNT_NAME = "Account";
    protected final static String PHONE_ACCOUNT = "+3752999999999";
    protected final static String FAX_ACCOUNT = "+3752999999999";
    protected final static String WEBSITE_ACCOUNT = "Yarosalv@gmail.com";
    protected final static String EMPLOYEES_ACCOUNT = "50";
    protected final static String ANNUAL_REVENUE_ACCOUNT = "100000";
    protected final static String BILLING_ZIP_ACCOUNT = "220466";
    protected final static String BILLING_COUNTRY_ACCOUNT = "Belarus";
    protected final static String EXPECTED_TYPE_ACCOUNT = "Customer";



    @Test(groups = {"regression"}, description = "create an account")
    public void createAccountTest() throws InterruptedException {
        LoginPage.setUserName(USER_NAME);
        LoginPage.setPassword(PASSWORD);
        LoginPage.clickLoginButton();
        HomePage.waitForPageLoaded();
        HomePage.openAccountsTab();
        AccountsPage.waitForPageLoaded();
        AccountsPage.clickNewAccountButton();
        NewAccountPage.waitForPageLoaded();
        NewAccountPage.setAccountName(ACCOUNT_NAME);
        NewAccountPage.setPhone(PHONE_ACCOUNT);
        NewAccountPage.setFax(FAX_ACCOUNT);
        NewAccountPage.setWebsiteAccount(WEBSITE_ACCOUNT);
        NewAccountPage.setEmployeesAccount(EMPLOYEES_ACCOUNT);
        NewAccountPage.setAnnualRevenueAccount(ANNUAL_REVENUE_ACCOUNT);
        NewAccountPage.clickTypeAccount();
        NewAccountPage.clickTypeCustomerAccount();
        NewAccountPage.clickIndustryAccount();
        NewAccountPage.clickIndustryBankingAccount();
        NewAccountPage.setBillingZipAccount(BILLING_ZIP_ACCOUNT);
        NewAccountPage.setBillingCountryAccount(BILLING_COUNTRY_ACCOUNT);
        NewAccountPage.clickCopyCheckbox();
        NewAccountPage.clickSaveAccountButton();
        AccountDetailsPage.waitForPageLoaded();
        Assert.assertEquals(AccountDetailsPage.getActualAccountName(), ACCOUNT_NAME);
        Assert.assertEquals(AccountDetailsPage.getActualAccountType(), EXPECTED_TYPE_ACCOUNT);

    }
}
package tests;


import models.Account;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Utils.Message;


public class CreateAccountsTest extends BaseTest {

    @Test(groups = {"regression"}, dataProvider = "AccountTestData")
    public void createAccountTest(Account newAccount)throws InterruptedException{
        LoginPage.setUserName(USER_NAME);
        LoginPage.setPassword(PASSWORD);
        LoginPage.clickLoginButton();
        HomePage.waitForPageLoaded();
        HomePage.openAccountsTab();
        AccountsPage.waitForPageLoaded();
        AccountsPage.clickNewButton();
        NewAccountModal.waitForPageLoaded();
        NewAccountModal.fillForm(newAccount);
        NewAccountModal.clickSaveButton();
        AccountDetailsPage.waitForPageLoaded();
        Assert.assertEquals(HomePage.getMessageText(), Message.expectedAccountMessageText(newAccount.getAccountName()));
        AccountDetailsPage.getAccountInfo();
        Assert.assertEquals(AccountDetailsPage.getAccountInfo(), newAccount);
        HomePage.LogOut();
        Thread.sleep(5000);
    }

    @DataProvider
    public Object[][] AccountTestData() {
        return new Object[][]{
                {FactoryAccount.AccountWithAllData()},
                {FactoryAccount.AccountWithAddress()},
        };
    }
}

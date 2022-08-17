package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {


    @Test(groups = {"smoke"}, description = "site authorization")
    public void loginTest() {
        LoginPage.setUserName(USER_NAME);
        LoginPage.setPassword(PASSWORD);
        LoginPage.clickLoginButton();
        Assert.assertTrue(HomePage.isUserIconDisplayed());
    }

    @Test(groups = {"regression"}, description = "exit by authorized user")
    public void logOutTest()  {
        LoginPage.setUserName(USER_NAME);
        LoginPage.setPassword(PASSWORD);
        LoginPage.clickLoginButton();
        HomePage.waitForPageLoaded();
        HomePage.clickProfileButton();
        HomePage.clickLogoutLink();
        LoginPage.waitForPageLoaded();
        Assert.assertTrue(LoginPage.isPageOpened());
    }
}
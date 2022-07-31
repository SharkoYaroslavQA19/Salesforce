package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test(groups = {"smoke"}, description = "site authorization")
    public void loginTest() throws InterruptedException {
        LoginPage.setUserName(USER_NAME);
        LoginPage.setPassword(PASSWORD);
        LoginPage.clickLoginButton();
        Assert.assertTrue(HomePage.isUserIconDisplayed());
    }

    @Test(groups = {"regression"}, description = "exit by authorized user")
    public void logOutTest() throws InterruptedException {
        LoginPage.setUserName(USER_NAME);
        LoginPage.setPassword(PASSWORD);
        LoginPage.clickLoginButton();
        HomePage.waitForUserIconDisplayed();
        HomePage.clickProfileButton();
        HomePage.clickLogoutLink();
        LoginPage.waitForPageLoaded();
        Assert.assertTrue(LoginPage.isPageOpened());
    }
}

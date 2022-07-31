package Test;

import Pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected final static String USER_NAME = "yasharko-ksz6@force.com";
    protected final static String PASSWORD = "Engine@46";
    protected WebDriver driver;
    protected LoginPage LoginPage;
    protected HomePage HomePage;
    protected LeadsPage LeadsPage;
    protected СreateLeadPage NewLeadPage;
    protected Pages.LeadDetailsPage LeadDetailsPage;
    protected AccountsPage AccountsPage;
    protected CreateAccountPage NewAccountPage;
    protected AccountDetailsPage AccountDetailsPage;


    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext testContext) throws Exception {
        String browserName = System.getProperty("browser", "chrome");
        driver = DriverFactory.getDriver(browserName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        testContext.setAttribute("driver", driver);
        LoginPage = new LoginPage(driver);
        HomePage = new HomePage(driver);
        NewLeadPage = new СreateLeadPage(driver);
        LeadDetailsPage = new LeadDetailsPage(driver);
        AccountsPage = new AccountsPage(driver);
        NewAccountPage = new CreateAccountPage(driver);
        AccountDetailsPage = new AccountDetailsPage(driver);
        LeadsPage = new LeadsPage(driver);
    }

    @BeforeMethod(alwaysRun = true)
    public void navigate() {
        LoginPage.open();
    }

    @AfterMethod(alwaysRun = true)
    public void clearCookies() {
        driver.manage().deleteAllCookies();
        ((JavascriptExecutor) driver).executeScript(String.format("window.localStorage.clear();"));
        ((JavascriptExecutor) driver).executeScript(String.format("window.sessionStorage.clear();"));
    }

    @AfterClass(alwaysRun = true)
    public void finish() {
        this.driver.quit();
    }

}

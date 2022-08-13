package tests;

import PageFactory.FactoryAccount;
import PageFactory.FactoryContract;
import PageFactory.FactoryLead;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;
import pages.modals.NewAccountModal;
import pages.modals.NewContacModal;
import pages.modals.NewLeadModal;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class BaseTest {
    protected final static String USER_NAME = "yasharko1989-xa0m@force.com";
    protected final static String PASSWORD = "Engine@45";

    protected WebDriver driver;
    protected LoginPage LoginPage;
    protected HomePage HomePage;
    protected LeadsPage leadsPage;
    protected LeadsPage LeadsPage;
    protected pages.modals.NewLeadModal NewLeadModal;
    protected LeadDetailsPage LeadDetailsPage;
    protected AccountsPage AccountsPage;
    protected NewAccountModal NewAccountModal;
    protected AccountDetailsPage AccountDetailsPage;
    protected ContactsPage ContactsPage;
    protected NewContacModal NewContacModal;
    protected ContactDetailsPage ContactDetailsPage;
    protected FactoryLead FactoryLead;
    protected FactoryContract FactoryContract;
    protected FactoryAccount FactoryAccount;

    @BeforeClass (alwaysRun = true)
    public void setUp(ITestContext testContext) throws Exception {
        String browserName = System.getProperty("browser", "chrome");
        driver = DriverFactory.getDriver(browserName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        testContext.setAttribute("driver", driver);
        LoginPage = new LoginPage(driver);
        HomePage = new HomePage(driver);
        leadsPage =new LeadsPage(driver);
        LeadsPage = new LeadsPage(driver);
        NewLeadModal = new NewLeadModal(driver);
        LeadDetailsPage = new LeadDetailsPage(driver);
        AccountsPage = new AccountsPage(driver);
        NewAccountModal = new NewAccountModal(driver);
        AccountDetailsPage = new AccountDetailsPage(driver);
        ContactsPage = new ContactsPage(driver);
        NewContacModal = new NewContacModal(driver);
        ContactDetailsPage = new ContactDetailsPage(driver);
        FactoryLead = new FactoryLead();
        FactoryContract = new FactoryContract();
        FactoryAccount = new FactoryAccount();

    }

    @BeforeMethod(alwaysRun = true)
    public void navigate() {
        LoginPage.open();
    }

    @AfterMethod(alwaysRun = true)
    public void ClearCookies() {
        driver.manage().deleteAllCookies();
        ((JavascriptExecutor) driver).executeScript(String.format("window.localStorage.clear();"));
        ((JavascriptExecutor) driver).executeScript(String.format("window.sessionStorage.clear();"));
    }
    @AfterClass(alwaysRun = true)
    public void quitDriver() {
        driver.quit();
    }
}
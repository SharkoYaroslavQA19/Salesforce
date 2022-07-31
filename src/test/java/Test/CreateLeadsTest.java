package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateLeadsTest extends BaseTest {
    protected final static String FIRSTNAME = "Yaroslav";
    protected final static String LASTNAME = "Yaroslav";
    protected final static String COMPANY = "LC Electronic";
    protected final static String PHONE = "++375299999999";
    protected final static String EMAIL = "Yaroslav@mail.ru";
    protected final static String TITLE = "Manager";
    protected final static String STREET = "Street";
    protected final static String CITY = "Minsk";
    protected final static String ZIP = "22046";
    protected final static String PROVINCE = "AAAAAAAAAAa";
    protected final static String COUNTRY = "Belarus";
    protected final static String EXPECTEDNAME = "Mr. " + FIRSTNAME + " " + LASTNAME;


    @Test(groups = {"regression"}, description = "Creating a new lead")
    public void createLeadTest() throws InterruptedException {
        LoginPage.setUserName(USER_NAME);
        LoginPage.setPassword(PASSWORD);
        LoginPage.clickLoginButton();
        HomePage.waitForPageLoaded();
        HomePage.openLeadsTab();
        LeadsPage.waitForPageLoaded();
        LeadsPage.clickNewLeadButton();
        NewLeadPage.waitForPageLoaded();
        NewLeadPage.clickLeadStatus();
        NewLeadPage.clickLeadStatusContacted();
        NewLeadPage.clickSalutation();
        NewLeadPage.clickSalutationMr();
        NewLeadPage.setFirstName(FIRSTNAME);
        NewLeadPage.setLastName(LASTNAME);
        NewLeadPage.setCompany(COMPANY);
        NewLeadPage.setPhone(PHONE);
        NewLeadPage.setEmail(EMAIL);
        NewLeadPage.clickRating();
        NewLeadPage.clickRatingHot();
        NewLeadPage.setTitle(TITLE);
        NewLeadPage.setStreet(STREET);
        NewLeadPage.setCity(CITY);
        NewLeadPage.setZip(ZIP);
        NewLeadPage.setProvince(PROVINCE);
        NewLeadPage.setCountry(COUNTRY);
        NewLeadPage.clickSaveButton();
        LeadDetailsPage.waitForPageLoaded();
        LeadDetailsPage.getActualName();
        Assert.assertEquals(LeadDetailsPage.getActualName(), EXPECTEDNAME);
    }
}

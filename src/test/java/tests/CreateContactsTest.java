package tests;


import models.Contact;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Utils.Message;

public class CreateContactsTest extends BaseTest {


    @Test(groups = {"regression"}, dataProvider = "ContactTestData")
    public void createContactTest(Contact newContact){
        LoginPage.setUserName(USER_NAME);
        LoginPage.setPassword(PASSWORD);
        LoginPage.clickLoginButton();
        HomePage.waitForPageLoaded();
        HomePage.openContactsTab();
        ContactsPage.waitForPageLoaded();
        ContactsPage.clickNewButton();
        NewContacModal.waitForPageLoaded();
        NewContacModal.fillForm(newContact);
        NewContacModal.clickSaveButton();
        ContactDetailsPage.waitForPageLoaded();
        Assert.assertEquals(HomePage.getMessageText(), Message.expectedContactMessageText(newContact.getSalutation().getName(), newContact.getFirstName(), newContact.getLastName()));
        ContactDetailsPage.getContactInfo();
        Assert.assertEquals(ContactDetailsPage.getContactInfo(), newContact);

    }

    @DataProvider
    public Object[][] ContactTestData() {
        return new Object[][]{
                    {FactoryContract.ContactWithAllData()},
                    {FactoryContract.ContactWithAddress()},
        };
    }
}

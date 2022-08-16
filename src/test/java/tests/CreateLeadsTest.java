package tests;

import models.Lead;
import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Utils.Message;


public class CreateLeadsTest extends BaseTest {



    @Test(groups = {"regression"}, dataProvider = "leadTestData")
    public void createLeadTest(Lead newLead) {
        LoginPage.setUserName(USER_NAME);
        LoginPage.setPassword(PASSWORD);
        LoginPage.clickLoginButton();
        HomePage.waitForPageLoaded();
        HomePage.openLeadsTab();
        LeadsPage.waitForPageLoaded();
        LeadsPage.clickNewButton();
        NewLeadModal.waitForPageLoaded();
        NewLeadModal.fillForm(newLead);
        NewLeadModal.clickSaveButton();
        LeadDetailsPage.waitForPageLoaded();
        Assert.assertEquals(HomePage.getMessageText(), Message.expectedLeadMessageText(newLead.getSalutation().getName(), newLead.getFirstName(), newLead.getLastName()));
        LeadDetailsPage.getLeadInfo();
        Assert.assertEquals(LeadDetailsPage.getLeadInfo(), newLead);

    }

    @DataProvider
    public Object[][] leadTestData() {
        return new Object[][]{
                {FactoryLead.LeadWithAllData()},
                {FactoryLead.LeadWithAddress()},
        };
    }
}

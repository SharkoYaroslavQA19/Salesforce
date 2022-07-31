package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class СreateLeadPage extends BasePage {
    By firstNameInput = By.xpath("//input[@name='firstName']");
    By lastNameInput = By.xpath("//input[@name='lastName']");
    By companyInput = By.xpath("//input[@name='Company']");
    By phoneInput = By.xpath("//input[@name='Phone']");
    By emailInput = By.xpath("//input[@name='Email']");
    By titleInput = By.xpath("//input[@name='Title']");
    By streetInput = By.xpath("//textarea[@name='street']");
    By cityInput = By.xpath("//input[@name='city']");
    By zipInput = By.xpath("//input[@name='postalCode']");
    By provinceInput = By.xpath("//input[@name='province']");
    By countryInput = By.xpath("//input[@name='country']");;
    By leadStatus = By.xpath("//label[contains(text(),'Lead Status')]/following-sibling::div");
    By leadStatusContacted = By.xpath("//span[contains(text(),'Contacted')]");
    By salutation = By.xpath("//label[contains(text(),'Salutation')]/following-sibling::div");
    By salutationMr = By.xpath("//span[contains(text(),'Mr.')]");
    By rating = By.xpath("//label[contains(text(),'Rating')]/following-sibling::div");
    By ratingHot = By.xpath("//span[contains(text(),'Hot')]");
    By saveButton = By.xpath("//button[@name='SaveEdit']");

    public СreateLeadPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(firstNameInput);
    }


    public void setFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void setCompany(String company) {
        driver.findElement(companyInput).sendKeys(company);
    }

    public void setPhone(String phone) {
        driver.findElement(phoneInput).sendKeys(phone);
    }

    public void setEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void setTitle(String title) {
        driver.findElement(titleInput).sendKeys(title);
    }

    public void setStreet(String street) {
        driver.findElement(streetInput).sendKeys(street);
    }

    public void setCity(String city) {
        driver.findElement(cityInput).sendKeys(city);
    }

    public void setZip(String zip) {
        driver.findElement(zipInput).sendKeys(zip);
    }

    public void setProvince(String province) {
        driver.findElement(provinceInput).sendKeys(province);
    }

    public void setCountry(String country) {
        driver.findElement(countryInput).sendKeys(country);
    }



    public void clickLeadStatus() {
        driver.findElement(leadStatus).click();
    }

    public void clickLeadStatusContacted() {
        driver.findElement(leadStatusContacted).click();
    }

    public void clickSalutation() {
        driver.findElement(salutation).click();
    }

    public void clickSalutationMr() {
        driver.findElement(salutationMr).click();
    }

    public void clickRating() {
        driver.findElement(rating).click();
    }

    public void clickRatingHot() {
        driver.findElement(ratingHot).click();
    }

    public void clickSaveButton() {
        driver.findElement(saveButton).click();
    }


}
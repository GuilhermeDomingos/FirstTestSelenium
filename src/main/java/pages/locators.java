package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class locators {

    WebDriver driver;

    By buttonSignin=By.linkText("Sign in");
    By formSigninBox=By.id("signinbox");
    By username=By.name("login");
    By password=By.name("password");
    By buttonLogin=By.linkText("SIGN IN");
    By buttonClickMe=By.className("me");
    By buttonMoreDataAboutYou=By.linkText("MORE DATA ABOUT YOU");
    By buttonAddmoreData=By.xpath("//button[@data-target=\"addmoredata\"]");
    By idendifyPopUpMoreData=By.id("addmoredata");
    By optionPhone=By.name("type");
    By contact=By.name ("contact");
    By savePopup=By.linkText("SAVE");

    public locators (WebDriver driver){
        this.driver=driver;
    }

    public void clickOnButtonSigninHome() {
        driver.findElement(buttonSignin).click();
    }

    public void identifySigninBox () {
        WebElement formSiginBox= driver.findElement(formSigninBox);
    }

    public void typeUsername (){
        driver.findElement(username).sendKeys("julio0001");
    }

    public void typePassword (){
        driver.findElement(password).sendKeys("123456");
    }

    public void clickOnButtonSigninPageLogin (){
        driver.findElement(buttonLogin).click();
    }

    public void clickOnButtonMe () {
        driver.findElement(buttonClickMe).click();
    }

    public void moreDataAboutYou () {
        driver.findElement(buttonMoreDataAboutYou).click();
    }

    public void clickOnButtonAddMoreData () {
        driver.findElement(buttonAddmoreData).click();
    }

    public void popUpData () {
        WebElement popupMoreData = driver.findElement(idendifyPopUpMoreData);
    }

    public void choiceType (){
        WebElement campoType = idendifyPopUpMoreData.findElement((SearchContext) optionPhone);
        new Select(campoType).selectByVisibleText("Phone");
    }

    public void tyoeContact () {
        driver.findElement(contact).sendKeys("+55999999999");
    }

    public void savePopup () {
        driver.findElement(savePopup).click();
    }

}






package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.locators;

public class varifyLogin {

    @Test
    public void verifyLoginTaskit(){
        System.setProperty("webdriver.chrome.diver","/home/guilherme/Documentos/driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.juliodelima.com.br/taskit/");

        locators login = new locators(driver);

        login.clickOnButtonSigninHome();
        login.identifySigninBox();
        login.typeUsername();
        login.typePassword();

    }

}
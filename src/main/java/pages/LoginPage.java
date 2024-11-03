package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends BaseTest {

    @Step("kullanıcı adı girilir")
    public LoginPage fillUsername(String text){

        driver.findElement(By.name("username")).sendKeys(text);
        return this;
    }

    @Step("password alanı girilir")
    public LoginPage fillPassword(String text){

        driver.findElement(By.name("password")).sendKeys(text);
        return this;
    }
    @Step( "login butonuna tıklanılır")
    public LoginPage clickLogin(){

        driver.findElement(By.cssSelector("[value='Log In']")).click();
        screenshot();
        return this;
    }

    @Step( "register butonuna tıklanır")
    public LoginPage clickRegister(){

        driver.findElement(By.cssSelector("[href*='register.htm']")).click();
        return this;
    }

}

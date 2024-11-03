import Base.BaseTest;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;

public class LoginTests extends BaseTest {

    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    MainPage mainPage=new MainPage();
    @Test(description = "başarılı giriş")
    public void login() {



       // driver.findElement(By.cssSelector("[href='register.htm']")).click();

         loginPage.fillUsername(username).
                 fillPassword(password).clickLogin();
        mainPage.errorControlMessage("An internal error has occurred and has been logged.");





        //String text = driver.findElement(By.cssSelector("[class='title']")).getText();

    }

    @Test(description = "başarısız giriş")
    public void LoginUnsuccesfulControl() {


        loginPage.fillUsername(username).
                fillPassword("4567").clickLogin();
        homePage.accountControl("welcome"+username);

    }

    @Test(description = "giriş gereklilik")
    public void LoginRequiredControl() {


        driver.findElement(By.name("username")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys("");
        driver.findElement(By.cssSelector("[value='Log In']")).click();


        //String text = driver.findElement(By.cssSelector("[class='title']")).getText();
        String text = driver.findElement(By.cssSelector("[class='error']")).getText();
        System.out.println(text);
        Assert.assertEquals("Please enter a username and password." , text);

        driver.findElement(By.name("username")).sendKeys("dfghjk");

        driver.findElement(By.cssSelector("[value='Log In']")).click();

        String text2 = driver.findElement(By.cssSelector("[class='error']")).getText();
        System.out.println(text2);
        Assert.assertEquals("Please enter a username and password." , text2);

        driver.findElement(By.name("username")).sendKeys("testUser");
        driver.findElement(By.name("password")).sendKeys("test123");

        driver.findElement(By.cssSelector("[value='Log In']")).click();
        String text3 = driver.findElement(By.cssSelector("[class='error']")).getText();
        System.out.println(text3);

    }
}

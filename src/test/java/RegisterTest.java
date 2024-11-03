
import Base.BaseTest;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {

    LoginPage loginPage=new LoginPage();
    RegisterPage registerPage=new RegisterPage();
    HomePage homePage=new HomePage();


        @Test(description = "kullanıcı oluşturma platformu")
        public void LoginSuccesfullControl() {
            String username = this.createUserName();

            loginPage.clickRegister();

            registerPage.fillFirstName("Test")
                    .fillLastName("QA")
                    .fillAddress("Ankara Cad.")
                    .fillCity("Ankara")
                    .fillState("State")
                    .fillZipCode("06000")
                    .fillPhoneNumber("123456789")
                    .fillSSN("123456789")
                    .fillUsername(username)
                    .fillPassword("123456789")
                    .repeatPassword("123456789")
                    .registerClick();

            homePage.registerControl("Welcome"+username);



        }


}
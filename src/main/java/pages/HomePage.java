package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends BaseTest {
  @Step("kullanıcı kontrolü")
    public HomePage accountControl(String value){
        String text = driver.findElement(By.cssSelector("[class='smallText']")).getText();

        Assert.assertEquals(value,text);
        return this;
    }

    @Step("kullanıcı oluşturma kontrolü ")
    public HomePage registerControl(String value){
        String text = driver.findElement(By.cssSelector("[class='title']")).getText();
        System.out.println(text);
        Assert.assertEquals(value, text);
        return this;
    }
}

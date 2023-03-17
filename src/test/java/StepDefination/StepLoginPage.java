package StepDefination;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class StepLoginPage extends PageObject {

    @Step("Enter Username")
    public void inputUserName(String UserName) {

        $(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
    }

    @Step("Enter Password")
    public void inputPassword(String PassWord) {
        $(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    }

    @Step("Click Submit Button")
    public void clickLogin()
    {
        $(By.xpath("//button[@Type='submit']")).click();
    }

}

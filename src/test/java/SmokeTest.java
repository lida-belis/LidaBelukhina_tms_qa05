import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SmokeTest extends BaseTest {

    private String URL = "https://www.saucedemo.com/index.html";

    @Test
    public void TestSWAGLABS() {
        String usernameValue = "standard_user";
        String passwordValue = "secret_sauce";

        driver.get(URL);

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys(usernameValue);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(passwordValue);

        WebElement login = driver.findElement(By.className("btn_action"));
        login.click();

        List<WebElement> elements = driver.findElements(By.className("inventory_item"));
        for (WebElement element: elements ) {
            System.out.println(element.findElement(By.className("inventory_item_name")).getText()+ " price: " + element.findElement(By.className("inventory_item_price")).getText());
        }
//
//        WebElement backpack = driver.findElement(By.cssSelector("#item_4_img_link >img"));
//
//        WebElement bikeLight = driver.findElement(By.cssSelector("#item_0_img_link > img"));
//
//        WebElement boltTShirt = driver.findElement(By.cssSelector("#item_1_img_link > img"));
//
//        WebElement fleeceJacket = driver.findElement(By.cssSelector("#item_5_img_link > img"));
//
//        WebElement onesie = driver.findElement(By.cssSelector("#item_2_img_link > img"));
//
//        WebElement tShirtRed = driver.findElement(By.cssSelector("#item_3_img_link > img"));
    }
}

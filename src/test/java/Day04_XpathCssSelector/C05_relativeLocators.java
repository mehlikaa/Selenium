package Day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_relativeLocators {

    public static void main(String[] args) {
//1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html  adresine gidin
//2 ) Berlin’i  3 farkli relative locator ile locate edin
//3 ) Relative locator’larin dogru calistigini test edin
        System.setProperty("webdriver.chrome.driver","src/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html ");

        //once uzerinden tarif yapacagimiz web elementlerini olcate etmeliyiz
        WebElement sailor= driver.findElement(By.id("pid11_thumb"));
        WebElement boston= driver.findElement(By.id("pid6_thumb"));
        WebElement bayArea= driver.findElement(By.id("pid8_thumb"));
        WebElement nyc= driver.findElement(By.id("pid3_thumb"));

        WebElement berlin1= driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston));
        System.out.println(berlin1.getText());
        System.out.println(berlin1.getAttribute("id"));
        driver.close();
    }
}

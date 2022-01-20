package Day03_WebElementsLocators;

import com.google.j2objc.annotations.Property;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementGetMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://a.testaddressbook.com");
        WebElement signInLinki=driver.findElement(By.id("sign-in"));

        System.out.println("Size ..."+signInLinki.getSize());
        System.out.println("getAriaRole() ..."+ signInLinki.getAriaRole() );
        System.out.println("getAccessibleName ..."+ signInLinki.getAccessibleName());
        //System.out.println("getAttribute( ..."+ signInLinki.getAttribute());
        System.out.println("Location ..."+ signInLinki.getLocation());
        System.out.println("GetRect Width..."+ signInLinki.getRect().width);
        System.out.println("GetRect X..."+ signInLinki.getRect().getX());
        System.out.println("GetCssValue Color ..."+ signInLinki.getCssValue("color"));

driver.quit();

    }
}
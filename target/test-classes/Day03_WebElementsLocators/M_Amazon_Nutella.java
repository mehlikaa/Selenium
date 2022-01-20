package Day03_WebElementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class M_Amazon_Nutella {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.amazon.com");
        Thread.sleep(1000);
        WebElement signInLinki=driver.findElement(By.linkText("Sign in"));
        signInLinki.click();

        WebElement emailim=driver.findElement(By.id("ap_email"));
        emailim.sendKeys("mehlika@balaban.gen.tr");

        WebElement continueButton= driver.findElement(By.className("a-button-input"));
        continueButton.click();
        WebElement passwordum= driver.findElement(By.id("ap_password"));
        passwordum.sendKeys("muradim81");
        WebElement signInSubmit=driver.findElement(By.id("signInSubmit" ));
        signInSubmit.click();

        WebElement aramaYap= driver.findElement(By.id("twotabsearchtextbox"));
        aramaYap.sendKeys("nutella");
        WebElement aramaButton= driver.findElement(By.id("nav-search-submit-button"));
        aramaButton.click();

// Acilan sayfada toplamda kac link var.
       List<WebElement> linkListem=driver.findElements(By.tagName("a"));
        // System.out.println("link Listem --> "+linkListem);
        System.out.println("Kac link var --> "+linkListem.size());
driver.close();
    }
}

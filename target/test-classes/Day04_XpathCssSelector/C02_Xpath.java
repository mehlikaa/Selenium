package Day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    //2- Add Element butonuna basin
    //3- Delete butonu’nun gorunur oldugunu test edin
    //4- Delete tusuna basin
    //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.xpath("//button[@onclick=\"addElement()\"]")).click();

        WebElement deleteButtonu=driver.findElement(By.xpath("//button[@class='added-manually']"));
        if(deleteButtonu.isDisplayed()){
            System.out.println(" Delete gorunuyor, Islem TAMAM");
        }else{
            System.out.println("Failed");
        }

        WebElement addYazisiElementi1=driver.findElement(By.xpath("//h3"));
        WebElement addYazisiElementi2= driver.findElement(By.tagName("h3"));
        if(addYazisiElementi1.isDisplayed()){
            System.out.println("Add yazisi 1 gorunuyor, Islem TAMAM");
        }else{
            System.out.println("Add yazisiFailed");
        }

        if(addYazisiElementi1.isDisplayed()){
            System.out.println("Add yazisi 2 gorunuyor, Islem TAMAM");
        }else{
            System.out.println("Add yazisiFailed");
        }

        //   -->
        //   -->    //button [text()='Add Element']



    }
}
